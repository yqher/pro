package com.sky.stringmethods;

public class OneTest {
    public static void main(String[] args) {
        String s = "abcdefg";
        System.out.println(s);
        char[] chars = s.toCharArray();
       // System.out.println(chars[1]);
        char tem='1';
        for (int i = 2; i <4 ; i++) {
             tem=chars[i];
             chars[i]=chars[7-i];
             chars[7-i] = tem;

        }
        String s1 = String.valueOf(chars);
        System.out.println(s1);


    }




}
