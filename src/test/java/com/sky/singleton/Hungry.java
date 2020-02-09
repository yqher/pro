package com.sky.singleton;

public class Hungry {
    public Hungry(){}
    private static  Hungry hungry = new Hungry();
    public static Hungry getInstance(){
        return hungry;
    }
}
