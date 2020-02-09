package com.sky.enum1;

import com.sky.annotationtest.MyAnnotition;

@MyAnnotition("gender")
 enum Gender implements Show{
    @MyAnnotition
    MALE("男"){
        @Override
        public void show() {
            System.out.println("na");
        }
    },
    FEMALE("女"){
        @Override
        public void show() {
            System.out.println("nv");
        }
    };

    private  final String genderName;

     Gender(String genderName) {
         this.genderName = genderName;
     }

     public String getGenderName() {
         return genderName;
     }


 }
