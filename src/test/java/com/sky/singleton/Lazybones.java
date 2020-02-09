package com.sky.singleton;

public class Lazybones {
    private Lazybones(){}
    private static Lazybones lazybones = null;
    public static Lazybones getInstance(){
        if(lazybones==null)
        lazybones = new Lazybones();
        return lazybones;
    }
}
