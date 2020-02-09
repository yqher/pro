package com.sky.annotationtest;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.FIELD;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,FIELD})
@Documented
@Inherited
public @interface MyAnnotition {
    String value() default "hello";
}
