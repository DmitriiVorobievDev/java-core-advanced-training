package com.dvdev.reflection_api.model;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE,
        ElementType.FIELD
})
@Retention(RetentionPolicy.RUNTIME)
public @interface MinAge {

    //метод аннотации
//    int age() default 18; //по умолчанию возраст не менее 18 лет
    int age(); //если не задаем значение по умолчанию, то нужно указать
    //при использовании аннотации
}
