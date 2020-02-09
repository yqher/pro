package com.sky.singleton;

public class Ehan {
    private Ehan(){

    }
    private  static Ehan ehan = new Ehan();

    public static  Ehan getInstance(){
        return  ehan;
    }
}
