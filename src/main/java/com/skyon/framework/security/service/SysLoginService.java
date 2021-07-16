package com.skyon.framework.security.service;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.skyon.common.constant.Constants;
import com.skyon.common.exception.CustomException;
import com.skyon.common.exception.user.UserPasswordNotMatchException;
import com.skyon.common.utils.MessageUtils;
import com.skyon.framework.manager.AsyncManager;
import com.skyon.framework.manager.factory.AsyncFactory;
import com.skyon.framework.redis.RedisCache;
import com.skyon.framework.security.LoginUser;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * 登录校验方法
 * 
 *
 */
@Component
public class SysLoginService
{
    @Autowired
    private TokenService tokenService;

    @Resource
    private AuthenticationManager authenticationManager;

    @Autowired
    private RedisCache redisCache;

    /**
     * 登录验证
     * 
     * @param username 用户名
     * @param password 密码
     * @param
     * @param uuid 唯一标识
     * @return 结果
     */
    public String login(String username, String password, String code, String uuid)
    {
        String verifyKey = Constants.CAPTCHA_CODE_KEY + uuid;
//        String captcha = redisCache.getCacheObject(verifyKey);
//        redisCache.deleteObject(verifyKey);
//        if (captcha == null)
//        {
//            AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.jcaptcha.expire")));
//            throw new CaptchaExpireException();
//        }
//        if (!code.equalsIgnoreCase(captcha))
//        {
//            AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.jcaptcha.error")));
//            throw new CaptchaException();
//        }
        // 用户验证
        Authentication authentication = null;
        try
        {
            // 该方法会去调用UserDetailsServiceImpl.loadUserByUsername  校验用户，并赋权
            authentication = authenticationManager
                    .authenticate(new UsernamePasswordAuthenticationToken(username, password));
        }
        catch (Exception e)
        {
            if (e instanceof BadCredentialsException)
            {
                AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, MessageUtils.message("user.password.not.match")));
                throw new UserPasswordNotMatchException();
            }
            else
            {
                AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_FAIL, e.getMessage()));
                throw new CustomException(e.getMessage());
            }
        }
        AsyncManager.me().execute(AsyncFactory.recordLogininfor(username, Constants.LOGIN_SUCCESS, MessageUtils.message("user.login.success")));
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();

//        // 单点登录实时智能魔方系统
//        if(loginUser.getUser().getUserName().equals("skyon")){
//            this.ssoLogin(loginUser);
//        }


        // 生成token
        return tokenService.createToken(loginUser);
    }

    private void ssoLogin(LoginUser loginUser){
        String username = loginUser.getUsername();
        String password = loginUser.getPassword();
        // 校验通过过才去单点登录实时智能魔方系统
        RestTemplate restTemplate = new RestTemplate();
//				String url = "http://localhost:8089/prod-api/sso/loginToken?userAccount={userAccount}&accessPwd={accessPwd}&appId={appId}";
//        String url = "http://192.168.4.95:8089/prod-api/sso/loginToken?userAccount={userAccount}&accessPwd={accessPwd}&appId={appId}";
        String url = "http://localhost:8089/sso/loginToken?userAccount={userAccount}&accessPwd={accessPwd}&appId={appId}";
        Map<String, Object> params = new HashMap<>();
        params.put("userAccount", username);
        params.put("accessPwd", password);
        params.put("appId", "127.0.0.1");
        Map map = restTemplate.getForObject(url, Map.class, params);
        System.out.println("+++++++++++++++++++");
        System.out.println(map.get("msg"));
        System.out.println(map.get("code"));
        System.out.println(map.get("token"));
        String tokenFerghana = "";
        if ("OK".equals(map.get("code"))) {
            tokenFerghana = map.get("token") + "";
        } else if ("500".equals(map.get("code").toString())) {
            tokenFerghana = map.get("msg").toString();
        }
        redisCache.setCacheObject(username + "fraudToken", tokenFerghana, 30, TimeUnit.MINUTES);
    }
}
