package com.study.design.adapter.c1;

/**
 * 类适配器模式（使用继承的适配器）
 * Adapter模式用于填补具有不同接口(API)的两个类之间的间隙
 * @author chenyao
 * @date 2017/11/1 15:01
 */
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("content");
        print.printWeak();
        print.printStrong();
    }
}
