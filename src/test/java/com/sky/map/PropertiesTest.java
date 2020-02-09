package com.sky.map;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            Properties properties = new Properties();
             fileInputStream = new FileInputStream("jdbc.properties");
            properties.load(fileInputStream);
            System.out.println(properties.getProperty("name")+"--->"+properties.getProperty("password"));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream!=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
