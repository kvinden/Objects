package com.company;

public class Main {
    public static void main(String[] args) {

        Person man = new Person(40, "����");
        Person woman = new Person(18, "����");
        man.move(man.fullName);
        woman.talk(woman.fullName);
    }
}
