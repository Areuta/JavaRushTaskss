package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> sort = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) sort.add(Integer.parseInt(reader.readLine()));
        Collections.sort(sort);
        for (Integer i : sort) System.out.println(i);
    }
}
