package com.sky.template;

public abstract class Template {
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public abstract  void code();

}

class SubTemp extends Template{

    @Override
    public void code() {
        int sum=0;
        for(int i =1;i<100 ;i++) {
            sum += i;
        }
    }
}
class Tes{
    public static void main(String[] args) {
        SubTemp subTemp = new SubTemp();
        subTemp.spendTime();
    }
}
