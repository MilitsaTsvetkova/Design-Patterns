package com.company.SingleTonDesignPattern;

import java.lang.reflect.Constructor;

//Reflection can be used to destroy all the above singleton implementation approaches.
// When you run the above test class, you will notice that hashCode of both the instances is not same that destroys the singleton pattern.
// Reflection is very powerful and used in a lot of frameworks like Spring and Hibernate
public class ReflectionSingletonTest {
    public static void main(String[] args) {
        EagerInitialization instanceOne = EagerInitialization.getInstance();
        EagerInitialization instanceTwo =null;

        try{
            Constructor[] constructors = EagerInitialization.class.getDeclaredConstructors();
            for (Constructor constructor: constructors) {
                constructor.setAccessible(true);
                instanceTwo=(EagerInitialization) constructor.newInstance();
                break;

            }
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
