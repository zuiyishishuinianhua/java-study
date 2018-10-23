package com.study.design.observer;

public class Main {


    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberObserver();

        Observer observer = new DigitObserver();
        Observer graphObserver = new GraphObserver();

        generator.addObserver(observer);
        generator.addObserver(graphObserver);

        generator.execute();

    }
}
