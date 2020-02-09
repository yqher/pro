package com.sky.reflect;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;
import java.util.Random;

public class ReflectTest {
    @Test
    public void reflectTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        //通过反射创建对象
        Class<Person> clazz = Person.class;
        Constructor<Person> constructor = clazz.getConstructor(String.class, String.class);
        Person p = constructor.newInstance("tom", "23");
        System.out.println(p);


        //通过反射调用属性和方法
        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p,"3");
        System.out.println(p);

        Method show = clazz.getDeclaredMethod("show");
        show.setAccessible(true);
        Object invoke = show.invoke(p);
    }

    @Test
    public void createClass() throws ClassNotFoundException {
        //Class的实例化
        //通过运行时类的属性
        Class<Person> personClass =Person.class;
        System.out.println(personClass);
        try {
            Person person1 = personClass.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        //通过运行时类的对象，getClass
        Person person = new Person();
        Class personClass1 = person.getClass();
        System.out.println(personClass1);
        //通过Class的静态方法 forName
        Class aClass = Class.forName("com.sky.reflect.Person");
        System.out.println(aClass);
        //类加载器
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        Class aClass1 = classLoader.loadClass("com.sky.reflect.Person");
        System.out.println(aClass1);
    }
    @Test
    public void propertiesTest() throws IOException {
        //读取配置文件
        Properties properties = new Properties();
        //方式一：
        /*FileReader fileReader = new FileReader("jdbc.properties");
        properties.load(fileReader);*/
       //方式二：ClassLoader,配置文件默认识别位置在src下
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("jdbc.properties");
        properties.load(resourceAsStream);
        String name = properties.getProperty("name");
        String password = properties.getProperty("password");
        System.out.println(name+"------"+password);
    }
    @Test
    public void dynamicTest(){
        //通过反射创建对象
        int i = new Random().nextInt(2);
        Object obj = null;
        switch(i){
            case 0:
                try {
                    obj=  createObject("java.lang.Object");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                break;
            case 1:
                try {
                    obj= createObject("com.sky.reflect.Person");
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                break;
        }
        System.out.println(obj);


    }
    public Object createObject(String classPath) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
            Class clazz = Class.forName(classPath);
            return clazz.newInstance();
    }
    @Test
    public  void getConstructor(){
        try {
            Class person = Class.forName("com.sky.reflect.Person");
            Constructor constructor = person.getConstructor();
            System.out.println(constructor);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } finally {
        }
    }

    @Test
    public void special() throws Exception{
        Class clazz = Class.forName("com.sky.reflect.Person");
        Person person = (Person) clazz.newInstance();

        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(person,"str" );
        String o = (String)name.get(person);
        System.out.println(o);

    }
    //获得运行时类的对象的指定属性
    @Test
    public void getSpecialField() throws  Exception{
        //获得运行时类的对象
        Class personClass = Class.forName("com.sky.reflect.Person");
         Person person = (Person)personClass.newInstance();

        //获得指定类的属性
        Field name = personClass.getDeclaredField("name");

        //保证此属性可访问
        name.setAccessible(true);

        //获取设置此属性值
        name.set(person,"jom" );

        System.out.println(name.get(person));
    }
   //获得运行时类的对象的指定方法
    @Test
    public void getSpecialMethod() throws Exception{
        //获得运行时类
        Class<Person> personClass = Person.class;
        Person person = personClass.newInstance();

        //获取方法
        Method display = personClass.getDeclaredMethod("display", String.class);

        //保证方法可访问
        display.setAccessible(true);

        //调用方法
        Object hekko = display.invoke(person, "hekko");
        System.out.println(hekko);

        //调用静态方法
        Method display1 = personClass.getDeclaredMethod("display", String.class, String.class);
        display1.setAccessible(true);
        Object tom = display1.invoke(personClass,"tom", "23");
        System.out.println(tom);
    }

}
