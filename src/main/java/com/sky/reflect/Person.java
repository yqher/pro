package com.sky.reflect;

public class Person {
    private String name;
    private String age;

    public Person() {
    }


    public Person(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    private String show (){
        String s = "hello";
        System.out.println(s);
        return s;
    }
    public String display(String name){
        String n = name;
        System.out.println(n);
        return n;
    }
    public static String display(String name ,String age){
        String n = name+"---->"+age;
        System.out.println(n);
        return n;
    }
}
