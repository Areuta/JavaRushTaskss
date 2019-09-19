package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) list.add(reader.readLine());

        int min = 0, max = 0;

        for (int i = 0; i < 10; i++) {
            if (list.get(i).length() < list.get(min).length()) min = i;
            if (list.get(i).length() > list.get(max).length()) max = i;
        }
        System.out.println(min +"" + max);
        if (min > max) min = max;
        System.out.println(list.get(min));
    }
}
