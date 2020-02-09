package com.sky.enum1;


import static com.sky.enum1.Gender.MALE;

public class EnumTest {
    public static void main(String[] args) {
        Gender[] values = Gender.values();
        for (int i = 0; i <values.length ; i++) {
            System.out.println(values[i].toString());
        }
        System.out.println("-------------------");

        Gender female = Gender.valueOf("FEMALE");
        System.out.println(female.getGenderName());
        female.show();
        System.out.println(female);
        System.out.println(MALE.getGenderName());


    }
}
