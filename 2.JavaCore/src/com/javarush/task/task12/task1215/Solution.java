package com.javarush.task.task12.task1215;

/* 
Кошки не должны быть абстрактными!
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat {
        public Cat getChild(){
            return null;
        }
        public String getName(){
            return null;
        }
    }

    public static class Dog {
        public Dog getChild(){
            return null;
        }
        public String getName(){
            return String.valueOf(new Dog());
        }
    }

}
