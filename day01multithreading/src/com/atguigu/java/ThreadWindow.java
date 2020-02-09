package com.atguigu.java;

public class ThreadWindow extends Thread {
    private static int ticket =100;
    private static Object object = new Object();
    @Override
    public void run() {
        while (true){
           show();
        }
    }
    public synchronized static void  show (){
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName() + "-------" + ticket);
            ticket--;
        }
    }
}
class R {
    public static void main(String[] args) {
        ThreadWindow threadWindow = new ThreadWindow();
        ThreadWindow threadWindow1 = new ThreadWindow();
        ThreadWindow threadWindow2 = new ThreadWindow();
        threadWindow.setName("窗口一");
        threadWindow1.setName("窗口二");
        threadWindow2.setName("窗口三");
        threadWindow.start();
        threadWindow1.start();
        threadWindow2.start();
    }
}

