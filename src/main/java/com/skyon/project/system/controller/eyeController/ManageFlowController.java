package com.skyon.project.system.controller.eyeController;

import com.skyon.framework.web.controller.BaseController;
import com.skyon.framework.web.domain.AjaxResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/manageFlow")
public class ManageFlowController extends BaseController {



    @GetMapping("/list")
    public AjaxResult getRemoveRiskList(Object object) {
        System.out.println("");
        List list = new ArrayList();

        List list1 = new ArrayList();
        Map map1 = new HashMap();
        map1.put("q","MD2021031200187");
        map1.put("w","未审核");
        map1.put("e","");
        map1.put("r","张山");
        map1.put("t","2020-02-03 13:52:12");
        list1.add(map1);
        list.add(list1);

        List list2 = new ArrayList();
        Map map2 = new HashMap();
        map2.put("q","MD2021031200101");
        map2.put("w","审核岗审核");
        map2.put("e","");
        map2.put("r","李四");
        map2.put("t","2020-02-03 13:52:12");
        map2.put("y","是");
        list2.add(map2);

        Map map22 = new HashMap();
        map22.put("q","MD2021031200102");
        map22.put("w","审核岗审核");
        map22.put("e","");
        map22.put("r","王五");
        map22.put("t","2020-02-03 13:52:12");
        map22.put("y","是");
        list2.add(map22);
        list.add(list2);

        return AjaxResult.success(list);
    }

    @GetMapping("/getDetail")
    public AjaxResult getRemoveRiskDetail() {
        List list = new ArrayList();

        //   申请信息
        Map maptwo = new HashMap();
        maptwo.put("applyValue","1月2日，一级信息");
        list.add(maptwo);

        return AjaxResult.success(list);
    }

    public static void main(String[] args) {

        System.out.println(Math.round(11.5));
        System.out.println(Math.round(11.4));
        System.out.println(Math.round(11.6));

        System.out.println(Math.round(-11.5));
        System.out.println(Math.round(-11.4));
        System.out.println(Math.round(-11.6));
    }


}
