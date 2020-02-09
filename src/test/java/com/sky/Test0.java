package com.sky;

public class Test0 {
    private Test0(){}
    private static Test0 singTon = new Test0();
    public static  Test0 getInstance(){
        return singTon;
    }
    public static void main(String[] args) {
        Test0 instance = Test0.getInstance();
        Test0 instance1 = Test0.getInstance();
        System.out.println(instance==instance1);


    }
}
class Test {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a + "," + b);
    }

    public static void operator(StringBuffer x, StringBuffer y) {
        x.append(y);
        y = x;
    }
}