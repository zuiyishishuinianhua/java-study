package com.study.design.observer;

import java.util.Random;

public class RandomNumberObserver extends NumberGenerator {


    private int number;
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for(int i=0; i<20; i++) {
            Random random = new Random();
            number = random.nextInt(50);
            notifyObservers();
        }
    }
}
