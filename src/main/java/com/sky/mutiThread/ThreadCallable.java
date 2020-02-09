package com.sky.mutiThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 实现多线程的方式三：
 * 1、实现Callable接口
 * 2、实现call方法
 * 3、创建callable实现类的对象
 * 4、创建FutureTask类的对象，将callable实现类的对象作为该类对象的构造器参数
 * 5、创建Thread 类对象，将FutureTask类对象作为Thread类构造器参数
 * 6.调用FutureTask对象的get方法，获得call方法的返回值
 */
public class ThreadCallable  implements Callable {
    //获得100以内的偶数，并返回和
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 0; i <=100 ; i++) {
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        ThreadCallable threadCallable = new ThreadCallable();
        FutureTask futureTask = new FutureTask(threadCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        try {
            System.out.println("和为："+futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
