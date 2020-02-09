package com.sky.mutiThread;

import java.util.concurrent.locks.ReentrantLock;

public class LockThread implements Runnable{
    private int ticket = 100;
    private ReentrantLock reentrantLock = new ReentrantLock();

    @Override
    public void run() {
        while(true){
            try {
                reentrantLock.lock();
                if(ticket>0){
                    System.out.println(Thread.currentThread().getName()+"----"+ticket);
                    ticket--;
                }else
                    break;
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}

