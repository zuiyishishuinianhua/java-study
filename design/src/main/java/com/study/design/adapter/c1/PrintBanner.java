package com.study.design.adapter.c1;

/**
 * @author chenyao
 * @date 2017/11/1 15:00
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
