package com.sky.text;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class Test {
    public static void main(String[] args) {

//                SafeLazySingleTon ton = SafeLazySingleTon.getInstance();
//                SafeLazySingleTon ton1 = SafeLazySingleTon.getInstance();
//                System.out.println();
//                System.out.println(ton1);


//        Ehan instance1 = Ehan.getInstance();
//        Ehan instance2 = Ehan.getInstance();
//        System.out.println(instance1==instance2);
//        System.out.println(instance1);
//        System.out.println(instance2);
//        Lanhan instance1 = Lanhan.getInstance();
//        Lanhan instance2 = Lanhan.getInstance();
//        System.out.println(instance1==instance2);
//        System.out.println(instance1);
//        System.out.println(instance2);
//        Hungry hungry = Hungry.getInstance();
//        Hungry hungry1 =Hungry.getInstance();
//        System.out.println(hungry==hungry1);
//        Lazybones instance = Lazybones.getInstance();
//        Lazybones instance1 = Lazybones.getInstance();
//        System.out.println(instance==instance1);
        /*Animal animal = new Cat();
        animal.eat();*/
//        String s = "  d f  ";
//        String s1 = s.replaceAll("^\\s+|\\s+$", "");
//        System.out.println("-----"+s+"------");
//        System.out.println("-----"+s1+"------");
//        String s = "abkkcadkabkebfkab";
//        String ab = "ab";
//        int count = 0;
//        for (int i = 0; i <=s.length()-ab.length() ; i++) {
//            String substring = s.substring(i, i + ab.length());
//            if(substring.contains(ab)){
//                count++;
//            }
//        }
//        System.out.println(count);
//
//    }
     //   String s = "efxsa";
//        char[] chars = s.toCharArray();
//        Arrays.sort(chars);
//        String s1 = new String(chars);
//        System.out.println(s1);
       // StringBuffer stringBuffer = new StringBuffer(s);
//

    }
    @org.junit.Test
    public void simpledateformattest() throws ParseException {
        Date date = new Date();
        System.out.println(date);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format1 = simpleDateFormat1.format(date);
        System.out.println(format1);
        Date parse = simpleDateFormat1.parse("2019-12-02 22:37:41");
        System.out.println(parse);
    }
    @org.junit.Test
    public void simpleTest() throws ParseException {
        //String-->sql.Date
        String s = "2019-09-12";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(s);
        java.sql.Date date = new java.sql.Date(parse.getTime());
        System.out.println(date);


    }
    @org.junit.Test
    public void localTimeTest(){
//        LocalDate now = LocalDate.now();
////        System.out.println(now.getMonth());
////        LocalDateTime now1 = LocalDateTime.now();
////        System.out.println(now1);
////        System.out.println(now1.minusDays(2));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
        TemporalAccessor parse = dateTimeFormatter.parse(format);
        System.out.println(parse);
    }

}
