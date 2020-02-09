package com.sky.singleton;

public class Lanhan {
    private Lanhan (){

    }

    private static  Lanhan lanhan = null;

    public static Lanhan getInstance(){
        if(lanhan==null) {
            lanhan = new Lanhan();
        }
        return  lanhan;
    }
}
