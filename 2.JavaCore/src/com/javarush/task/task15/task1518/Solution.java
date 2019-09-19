package com.javarush.task.task15.task1518;

/* 
Статики и котики
*/

public class Solution {
    public static Cat cat;



    public static void main(String[] args) {
        System.out.println("begin");
    }

    public static class Cat {
        public String name;
    }

    static {
        Solution solution = new Solution();
        solution.cat = new Cat();
        cat.name = "Vaska";

        System.out.println(cat.name);
        System.out.println(solution.cat.name);

    }

}
