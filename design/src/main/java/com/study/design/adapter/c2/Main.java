package com.study.design.adapter.c2;

/**
 * 对象适配器模式（使用委托的适配器）
 * @author chenyao
 * @date 2017/11/1 15:06
 */
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("Hello");
        print.printWeak();
        print.printStrong();
    }

}
