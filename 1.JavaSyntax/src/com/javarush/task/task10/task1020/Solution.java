package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++) array[i] = Integer.parseInt(reader.readLine());

        sort(array);
        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    indexMin = j;
                }
            }
            if (i != indexMin) {
                int tmp = array[i];
                array[i] = array[indexMin];
                array[indexMin] = tmp;
            }

        }
    }
}
