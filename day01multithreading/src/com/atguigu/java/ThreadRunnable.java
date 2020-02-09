package com.atguigu.java;

/**
 * 多线程的实现方式二：实现runnable接口
 * //1、实现runnable接口
 * //2、实现run方法
 * //3、创建该类的对象
 * //4、创建Thread对象，将实现runnable接口的类的对象作为Thread构造器的参数
 * //5、调用Thread对象的start方法：开启线程，执行线程的run方法
 */

//1、实现runnable接口
public class ThreadRunnable implements Runnable {
    //2、实现run方法
    //打印100以内的偶数
    @Override
    public void run() {
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"-----------"+i);
            }
        }
    }

    public static void main(String[] args) {
        //3、创建该类的对象
        ThreadRunnable threadRunnable = new ThreadRunnable();
        //4、创建Thread对象，将实现runnable接口的类的对象作为Thread构造器的参数
        Thread thread = new Thread(threadRunnable);
        //5、调用Thread对象的start方法：开启线程，执行线程的run方法
        thread.start();

    }



}
