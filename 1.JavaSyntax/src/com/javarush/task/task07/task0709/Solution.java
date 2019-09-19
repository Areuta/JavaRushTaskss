package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> stringArrayList = new ArrayList<>(5);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            stringArrayList.add(reader.readLine());
        }

        int min = stringArrayList.get(0).length();
        for (int i = 0; i < 5; i++)
            if (stringArrayList.get(i).length() < min) min = stringArrayList.get(i).length();
        for (int i = 0; i < 5; i++) {
            if (stringArrayList.get(i).length() == min) System.out.println(stringArrayList.get(i));

        }
    }
}
