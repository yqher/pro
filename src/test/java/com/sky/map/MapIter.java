package com.sky.map;

import java.util.*;

public class MapIter {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("AA",1 );
        map.put("CC",3 );
        map.put("BB",2 );
        //获得所有的key
        Set keySet = map.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //获得所有的value
        Collection values = map.values();
        Iterator iterator1 = values.iterator();
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        for(Object value : values){
            System.out.println(value);
        }
        //获得key-value
        Set entrySet = map.entrySet();
        Iterator iterator2 = entrySet.iterator();
        while(iterator2.hasNext()){
            Map.Entry entry = (Map.Entry)iterator2.next();
            System.out.println(entry.getKey()+"------>"+entry.getValue());
        }

    }
}
