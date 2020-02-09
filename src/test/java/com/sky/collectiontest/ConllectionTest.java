package com.sky.collectiontest;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ConllectionTest {
    public static void main(String[] args) {
        Comparator comparator= new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User user1 = (User)o1;
                    User user2 = (User)o2;
                    return Integer.compare(user1.getAge(),user2.getAge());
                }else {
                    throw  new RuntimeException("输入类型不匹配");
                }

            }
        };
        TreeSet treeSet = new TreeSet(comparator);
        treeSet.add(new User("jery",32));
        treeSet.add(new User("apple",32));
        treeSet.add(new User("mike",32));
        treeSet.add(new User("jj",32));
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

//    @Test
//    public void collectionTest() {
//            String[] str = new String[5];
//            for (String myStr : str) {
//                myStr = "atguigu";
//                System.out.println(myStr);
//            }
//            for (int i = 0; i < str.length; i++)
//                System.out.println(str[i]);
//        }

}
       /* Collection collection = new ArrayList();
       // System.out.println(collection.size());
        collection.add(2);
        collection.add(new Date());
        collection.add("hello");
        System.out.println(collection);
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            Object object = iterator.next();
            if("hello".equals(object)){
                iterator.remove();
            }
        }
        iterator = collection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        for (Object o : collection) {
            System.out.println(o);
        }*/
//        System.out.println(collection.size());
//        System.out.println(collection);
//
//        Collection collection1 = new ArrayList();
//
//        collection1.add(2);
//        collection1.add(new Date());
//        collection1.add("hello");
//        collection.addAll(collection1);
//        System.out.println(collection.size());
//        collection.clear();
//        System.out.println(collection.size());
//        System.out.println(collection.isEmpty());



