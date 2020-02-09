package com.sky.comparable;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableTest {
    public static void main(String[] args) {
        Goods[] goods = new Goods[4];
        goods[0] = new Goods("apple",4);
        goods[1] = new Goods("cat",2);
        goods[2] = new Goods("dog",21);
        goods[3] = new Goods("pair",1);
        System.out.println(goods[0]);
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }
    @Test
    public void compartorTest(){
        String[] s = new String[]{"4","56","266"};
        Arrays.sort(s, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        System.out.println(Arrays.toString(s));
    }
}
