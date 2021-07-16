package com.skyon.project.system.controller.eyeController;

import com.skyon.common.utils.SecurityUtils;
import com.skyon.framework.redis.RedisCache;
import com.skyon.framework.security.LoginUser;
import com.skyon.framework.web.domain.AjaxResult;
import com.skyon.project.system.domain.SysUser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping(value = "/ssoFerghana")
public class SsoFerghana {
    private static final Logger log = LoggerFactory.getLogger(SsoFerghana.class);

    @Autowired
    private RedisCache redisCache;

    private Map commen() {
        Map map = new HashMap();
        // 先不用单点登录

//        LoginUser loginUser = SecurityUtils.getLoginUser();
//        SysUser user = loginUser.getUser();
//        // 判断是否已经登录过
//        String alreadySSO = (String) redisCache.getCacheObject(user.getUserName() + "alreadySSO");
//        log.info("------------alreadySSO:[{}]", alreadySSO);
//        if (!"1".equals(alreadySSO)) {
//            Object fraudFerghana = redisCache.getCacheObject(user.getUserName() + "fraudToken");
//            log.info("------------token:[{}]", fraudFerghana);
//            map.put("token", fraudFerghana + "");
//        }
//        redisCache.setCacheObject(user.getUserName() + "alreadySSO", "1", 30, TimeUnit.MINUTES);
//        map.put("alreadySSO", alreadySSO);
//
//        map.put("userAccount", user.getUserName());
        return map;
    }

//    @ResponseBody
//    @RequestMapping("/queryAlreadySSO")
//    public SysResult queryAlreadySSO() {
//        User attribute = (User) SecurityUtils.getSubject().getSession()
//                .getAttribute(MsgConstant.FRAUD_CURRENTUSER);
//        String alreadySSO = (String) redisCache.getCacheObject(attribute.getUsername() + "alreadySSO");
//        if (!"1".equals(alreadySSO)) {
//            return SysResult.result(MsgConstant.RESULT_CODE_ERROR, MsgConstant.ERROR);
//        }
//        return SysResult.result(MsgConstant.RESULT_CODE_SUCCESS, MsgConstant.SUCCESS);
//
//    }

    // 数据源表
    @GetMapping("/source/manage")
    public AjaxResult manage() {
        Map map = this.commen();
        map.put("redirect", "/source/manage");
        return AjaxResult.success(map);
    }

    // 数据维表
    @GetMapping("/source/dimension")
    public AjaxResult dimension() {
        Map map = this.commen();
        map.put("redirect", "/source/dimension");
        return AjaxResult.success(map);
    }

    // 数据结果表
    @GetMapping("/source/result")
    public AjaxResult result() {
        Map map = this.commen();
        map.put("redirect", "/source/result");
        return AjaxResult.success(map);
    }

    // 自定义函数
    @GetMapping("/variable/funcdevelop")
    public AjaxResult funcdevelop() {
        Map map = this.commen();
        map.put("redirect", "/variable/funcdevelop");
        return AjaxResult.success(map);
    }

    // 变量分类
    @GetMapping("/variable/classification")
    public AjaxResult classification() {
        Map map = this.commen();
        map.put("redirect", "/variable/classification");
        return AjaxResult.success(map);
    }

    // 变量管理
    @GetMapping("/variable/manager")
    public AjaxResult variableManager() {
        Map map = this.commen();
        map.put("redirect", "/variable/manager");
        return AjaxResult.success(map);
    }

    // 变量包管理
    @GetMapping("/variable/package-manager")
    public AjaxResult variablePackage() {
        Map map = this.commen();
        map.put("redirect", "/variable/package-manager");
        return AjaxResult.success(map);
    }

    // 运行中作业
    @GetMapping("/operation/runingjob")
    public AjaxResult runingjob() {
        Map map = this.commen();
        map.put("redirect", "/operation/runingjob");
        return AjaxResult.success(map);
    }
}

