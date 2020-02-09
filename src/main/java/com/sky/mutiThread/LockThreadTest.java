package com.sky.mutiThread;

public class LockThreadTest {
    public static void main(String[] args) {
        LockThread lockThread = new LockThread();

        Thread thread = new Thread(lockThread);
        Thread thread1 = new Thread(lockThread);
        Thread thread2 = new Thread(lockThread);
        thread.setName("窗口一");
        thread1.setName("窗口二");
        thread2.setName("窗口三");
        thread.start();
        thread1.start();






        thread2.start();
    }
}
