package com.studyaop.jdk.c1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    MyInvocationHandler() {
        super();
    }

    MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("++++++before " + method.getName() + "++++++");
        Object result = method.invoke(target, args);
        System.out.println("++++++after " + method.getName() + "++++++");
        return result;
    }
}
