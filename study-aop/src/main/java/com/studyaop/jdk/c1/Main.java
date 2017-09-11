package com.studyaop.jdk.c1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {


    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        InvocationHandler invocationHandler = new MyInvocationHandler(userService);
        UserService userServiceProxy = (UserService) Proxy.newProxyInstance(userService.getClass().getClassLoader(),
                userService.getClass().getInterfaces(), invocationHandler);
        System.out.println(userServiceProxy.getName());
        System.out.println(userServiceProxy.getAge());
    }
}
