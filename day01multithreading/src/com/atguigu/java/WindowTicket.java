package com.atguigu.java;

/**
 * 多线程模拟三窗口抢票
 *
 */
public class WindowTicket implements Runnable {
    private int ticket = 100;
    Object object= new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (object) {
                if (ticket > 0) {

                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "----" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
