package com.studyaop.jdk.c1;

public class UserServiceImpl implements UserService{


    @Override
    public String getName() {
        System.out.println("getname...");
        return "zhangsan";
    }

    @Override
    public Integer getAge() {
        System.out.println("getage...");
        return 20;
    }
}
