package com.sky.template;

public abstract class Temp {
    public void spendTime() {
        long l = System.currentTimeMillis();
        code();
        long l1 = System.currentTimeMillis();

    }
    public abstract void code();
}
