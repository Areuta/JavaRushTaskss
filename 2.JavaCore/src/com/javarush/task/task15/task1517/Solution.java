package com.javarush.task.task15.task1517;

/* 
Статики и исключения
*/

public class Solution {
    public static int A = 0;
    public static int B = 5;

    static {
        if (Math.sin(3) < 0.5)
            throw new ArithmeticException();


    }

    public static void main(String[] args) {
        System.out.println(B);
    }

    void except() {
        if (Math.sin(3) < 0.5)
            throw new ArithmeticException();


    }

}
