package com.sky.com.sky.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("hello.txt");
        File file1 = new File("E:\\test_data\\io.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        System.out.println(file1.renameTo(file));
        System.out.println("-----------------");
        File file2 = new File("E:\\test_data");
        String[] list = file2.list();
        for(String s:list){
            System.out.println(s);
        }

    }
    @Test
    public void test1() throws IOException {
        File file = new File("E:\\test_data\\io1.txt");
        if(!file.exists()){
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        }else{
            boolean delete = file.delete();
            System.out.println(delete+"删除成功");
        }
    }
    @Test
    public void test2() throws IOException {
        //创建和E:\test_data\io1.txt同目录下的文件h.txt
        File file = new File("E:\\test_data\\io1.txt");
        File file1 = new File(file.getParent(), "h.txt");
        boolean newFile = file1.createNewFile();
        if(newFile){
            System.out.println("创建成功");

        }

    }

    @Test
    public void test3(){
        File file = new File("E:\\test_data");
        String[] list = file.list();
        for(String s: list){
           if(s.endsWith("csv")){
                System.out.println(s);
           }
        }
    }
    @Test
    public void test5(){
        Map<String,Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator=entry.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Integer> entry1 =  iterator.next();
            System.out.println(entry1.getKey()+"---->"+entry1.getValue());
        }
    }

}
