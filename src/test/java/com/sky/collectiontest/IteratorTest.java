package com.sky.collectiontest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
    @Test
    public void iter(){
        //iterator remove
        List list = new ArrayList();
        list.add("tom");
        list.add("mary");
        list.add("mike");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        Iterator iter = list.iterator();
        while (iter.hasNext()){
            String next = (String) iter.next();
            if("tom".equals(next)){
                iter.remove();
            }

        }
         iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
