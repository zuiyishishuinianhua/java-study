package com.study.design.observer;

public class GraphObserver implements Observer {

    @Override
    public void update(NumberGenerator numberGenerator) {
        for(int i =0; i < numberGenerator.getNumber(); i++) {
            System.out.print("*");
        }
        System.out.println();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
