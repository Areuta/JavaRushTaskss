package com.javarush.task.task09.task0917;

/* 
Перехват unchecked-исключений
*/

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());
    }

    public static void processExceptions(Solution obj) {
        try {
            obj.method2();
            obj.method3();
            obj.method1();


        } catch (Throwable e) {
            if(e instanceof RuntimeException)printStack(e); else throw e;
        }
    }

    public static void printStack(Throwable throwable) {
        System.out.println(throwable);
        for (StackTraceElement element : throwable.getStackTrace()) {
            System.out.println(element);
        }
    }

    public void method1() {
        throw new NullPointerException();
    }

    public void method2() {
        throw new IndexOutOfBoundsException();
    }

    public void method3() {
        throw new NumberFormatException();
    }
}

