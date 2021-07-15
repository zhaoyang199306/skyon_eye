package com.skyon.framework.manager;

import com.skyon.common.utils.StringUtils;
import org.junit.Test;

import java.lang.reflect.Field;

public class JavaReflct {

    @Test
    public void hello() throws Exception {
        System.out.println("---");

        Class aClass = Class.forName("com.skyon.framework.security.LoginUser");
        Object o = aClass.newInstance();

        Field field = aClass.getDeclaredField("token");
        field.setAccessible(true);
        field.set(o,"sss");
        System.out.println(field.get(o));

        Field[] fields = aClass.getDeclaredFields();
        for (Field field1 : fields) {
            System.out.println(field1.getName());
        }


    }
}
