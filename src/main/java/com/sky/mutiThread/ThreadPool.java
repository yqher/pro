package com.sky.mutiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 创建多线程方式四：使用线程池
 * 1、创建
 */
public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        //System.out.println(executorervice.getClass());
        ThreadPoolExecutor ser= (ThreadPoolExecutor) executorService;
        //设置线程池属性
        for (int i = 0; i <20 ; i++) {
            ser.execute(new R());
        }


    }

}
class R implements Runnable{


    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }

        }
    }
}
