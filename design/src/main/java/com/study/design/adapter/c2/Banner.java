package com.study.design.adapter.c2;

/**
 * @author chenyao
 * @date 2017/11/1 14:58
 */
public class Banner {

    private String str;

    public Banner(String str) {
        this.str = str;
    }

    public void showWithParen() {
        System.out.println("(" + str + ")");
    }

    public void showWithAster() {
        System.out.println("*" + str + "*");
    }


}
