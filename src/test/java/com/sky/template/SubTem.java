package com.sky.template;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

public class SubTem extends Temp {
    @Override
    public void code() {
        int sum = 0;
        for(int i =0;i<2000000000;i++){
            for(int j=0;j<i;i++)
            sum+=i;
        }
    }

    public static void main(String[] args) {
        SubTemp subTemp = new SubTemp();
        subTemp.spendTime();
    }
    @Test
    public void test7() {
        try {


        } catch (Exception e) {

        }
        finally {

        }
    }
}
