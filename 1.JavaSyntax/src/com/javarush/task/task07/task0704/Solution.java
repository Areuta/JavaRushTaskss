package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {
    public static void reverseArray(int[] masssiv) {
        int c;
        for (int i = 0; i < masssiv.length / 2; i++) {
            c = masssiv[i];
            masssiv[i] = masssiv[masssiv.length - i - 1];
            masssiv[masssiv.length - i - 1] = c;
        }

    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ReverseArray = new int[10];
        for (int i = 0; i < 10; i++) ReverseArray[i] = Integer.parseInt(reader.readLine());
        reverseArray(ReverseArray);
        for (int i = 0; i < 10; i++) System.out.println(ReverseArray[i]);
    }
}

