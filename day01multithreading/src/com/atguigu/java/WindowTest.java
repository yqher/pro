package com.atguigu.java;

public class WindowTest {

        public static void main(String[] args) {
            WindowTicket windowTicket = new WindowTicket();
            Thread thread = new Thread(windowTicket);
            Thread thread1 = new Thread(windowTicket);
            Thread thread2 = new Thread(windowTicket);
            thread.setName("窗口1");
            thread1.setName("窗口2");
            thread2.setName("窗口3");
            thread.start();
            thread1.start();
            thread2.start();
        }
    }


