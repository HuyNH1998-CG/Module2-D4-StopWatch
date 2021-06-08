package com.codegym;

public class Main {

    public static void main(String[] args) {
        StopWatch watch = new StopWatch();
        watch.start();
        for (int i = 0; i < 100000; i++) {
            System.out.println(i);
        }
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}
