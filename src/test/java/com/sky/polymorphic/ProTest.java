package com.sky.polymorphic;

public class ProTest {
    public static void main(String[] args) {
        /*ProTest proTest = new ProTest();
        proTest.animalEat(new Dog());*/
        Dog dog = new Dog();
        System.out.println(dog instanceof Animal);

    }
    public void animalEat(Animal animal){
          animal.eat();
    }
}
