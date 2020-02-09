package com.sky.singleton;

public class SafeLazySingleTon {
    private SafeLazySingleTon(){}
    private static SafeLazySingleTon ton = null;

    public static synchronized SafeLazySingleTon getInstance(){

        if(ton == null)
            ton = new SafeLazySingleTon();
        return ton;
    }


}


