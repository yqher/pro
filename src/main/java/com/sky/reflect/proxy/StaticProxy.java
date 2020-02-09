package com.sky.reflect.proxy;

public class StaticProxy {
    interface ClothFactory{
        public void produceCloth();
    }


    public static  void main(String[] args) {
        NikeClothFactory nikeClothFactory = new NikeClothFactory();
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nikeClothFactory);
        proxyClothFactory.produceCloth();


    }
}
class ProxyClothFactory implements StaticProxy.ClothFactory {
    private StaticProxy.ClothFactory clothFactory;

    public ProxyClothFactory(StaticProxy.ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("衣服工厂开始生产");
        clothFactory.produceCloth();
        System.out.println("衣服工厂结束生产");
    }
}
class NikeClothFactory implements StaticProxy.ClothFactory {

    @Override
    public void produceCloth() {
        System.out.println("Nike");
    }
}

