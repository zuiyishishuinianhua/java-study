package com.study.design.adapter.c2;

/**
 * @author chenyao
 * @date 2017/11/1 15:05
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String str) {
        this.banner = new Banner(str);
    }
    @Override
    void printWeak() {
        banner.showWithParen();
    }

    @Override
    void printStrong() {
        banner.showWithAster();
    }
}
