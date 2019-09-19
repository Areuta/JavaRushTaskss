package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>(10);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) list.add(Integer.parseInt(reader.readLine()));
        int max = 1;

        for (int i = 0; i < 9; ) {
            Integer s = 1;

            while ((i + s)< 10 && list.get(i).equals(list.get(i + s)) ) s += 1;
            if (s > max) max = s;
            i +=s;

        }

        System.out.println(max);
    }
}