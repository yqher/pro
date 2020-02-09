package com.atguigu.java;

public class ThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        /*MyThread1 myThread1 = new MyThread1();
        myThread1.start();
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+"----"+i+"********************");
            }
        }*/
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i <100 ; i++) {
//                    if(i%2==0)
//                        System.out.println(Thread.currentThread().getName()+"--"+i);
//                }
//            }
//        }.start();
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i <100 ; i++) {
//                    if(i%2!=0)
//                        System.out.println(Thread.currentThread().getName()+"--"+i);
//                }
//            }
//        }.start();
        Thread.currentThread().setName("主线程");
        for (int i = 0; i <100 ; i++) {
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+"--"+i);
            System.out.println(myThread.isAlive());}
            if(i==20){

                try {

                    myThread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(myThread.isAlive());
        }

    }



}
