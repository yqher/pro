package com.atguigu.java;

/**
 * 多线程的创建。方式一：继承于Thread类
 * 1、创建一个继承Thread类的子类
 * 2、子类重写run方法--线程执行的操作写在run方法中
 * 3、在main中创建子类对象
 * 4、调用子类对象的start方法
 */
public class MyThread extends Thread{
    //输出100以内的偶数
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"--"+ i);
            }
        }
    }
}
class MyThread1 extends Thread{
    //输出100以内的奇数
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {

            if(i%2!=0){
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"--"+ i);
            }
        }
    }
}