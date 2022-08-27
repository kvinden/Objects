package com.company;

public class Person {
    int age;
    String fullName;
    Person(int age, String fullName){
        this.age = age;
        this.fullName = fullName;
    }
    static void move(String fullName){
        System.out.println(fullName+" передвигается");
    }
    static void talk(String fullName){
        System.out.println(fullName+" разговаривает");
    }
}
