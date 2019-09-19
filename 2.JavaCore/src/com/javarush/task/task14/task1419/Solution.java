package com.javarush.task.task14.task1419;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Class clas = Class.forName("name");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] intMassive = {1, 2, 3};
            int i = intMassive[10];
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            String s = null;
            boolean b = s.equals("1");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            FileReader reader = new FileReader("c:/ some.txt");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int i = Integer.parseInt("abcd");
        }
        catch (Exception e) {
            exceptions.add(e);
        }
        Exception e =  new RuntimeException(); exceptions.add(e);
        Exception ee =  new IllegalAccessException(); exceptions.add(ee);
        Exception eee =  new IllegalArgumentException(); exceptions.add(eee);


    }
}
