package com.test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by yao_pc on 2017/9/6.
 */
public class AppImpl implements App {
    @Override
    public void get(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<? extends App> clazz = AppImpl.class;
        Class<?>[] interfaces = clazz.getInterfaces();

        Method method = interfaces[0].getDeclaredMethod("get", int.class, int.class);
        Parameter[] parameters = method.getParameters();
        for(Parameter p : parameters) {
            Annotation[] annotations = p.getAnnotations();
            //System.out.println(annotations);
            Param param = p.getAnnotation(Param.class);
            System.out.println(param.name());
        }


    }
}
