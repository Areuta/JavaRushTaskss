package com.javarush.task.task12.task1204;

/* 
То ли птица, то ли лампа
*/

public class Solution {
    public static void main(String[] args) {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o) {
        String message = null;
        if (o instanceof Cat) message = "Кошка";
        if (o instanceof Bird) message = "Птица";
        if (o instanceof Lamp) message = "Лампа";
        if (o instanceof Dog) message = "Собака";
        System.out.println(message);

    }

    public static class Cat {
    }

    public static class Dog {
    }

    public static class Bird {
    }

    public static class Lamp {
    }
}
