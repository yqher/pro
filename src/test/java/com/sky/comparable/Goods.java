package com.sky.comparable;

public class Goods implements Comparable<Goods>{
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 按照商品价格升序排序
     * @param o
     * @return
     */
    @Override
    public int compareTo(Goods o) {

           if(this.price > o.price){
               return 1;
           }else if(this.price<o.price) {
              return -1;
           }else {
               return  0;
           }


    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
