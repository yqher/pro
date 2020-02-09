package com.sky.mutiThread;

/**
 * 生产者 Productor 将产品交给店员 ( Clerk)，而消费者 ( 从店员处
 * 取走产品，店员一次只能持有固定数量的产品 比如 :20 ），如果生产者试图
 * 生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品了再通
 * 知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如
 * 果店中有产品了再通知消费者来取走产品。
 */
public class MultiThreadingExe {
    public static void main(String[] args) {
        Clerk clerk=new Clerk();
        Consumer consumer = new Consumer(clerk);
        Productor productor = new Productor(clerk);
        consumer.setName("消费者1");
        productor.setName("生产者1");
        consumer.start();
        productor.start();
    }

}
class Clerk{
    private int num=0;


    public synchronized void consumeProduct() {
        if(num>0){
            System.out.println(Thread.currentThread().getName()+":正在消费第"+num+"个商品");
            num--;
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void productProductor() {
        if(num<20){
            num++;
            System.out.println(Thread.currentThread().getName()+"正在生产第"+num+"个产品");
            notify();
        }else {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Consumer extends Thread{
    private Clerk clerk ;

    public Consumer(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("消费者开始消费产品");
        while(true){
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();

        }
    }
}
class Productor extends Thread{
  private Clerk clerk;

    public Productor(Clerk clerk) {
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println("生产者开始生产产品");
        while (true){
            try {
                sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.productProductor();
        }
    }
}

