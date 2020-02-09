package com.atguigu.java;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest1 {
    public static void main(String[] args) throws IOException {
        //读取配置文件
        Properties properties = new Properties();
        //方式一：
        /*FileReader fileReader = new FileReader("jdbc.properties");
        properties.load(fileReader);*/
        //方式二：ClassLoader,配置文件默认识别位置在src下
        ClassLoader classLoader = ReflectTest1.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(resourceAsStream);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println(name+"------"+password);
    }
}
