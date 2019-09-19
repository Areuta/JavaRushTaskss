package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> result = new ArrayList<>();
        int[] arrayLength = {5, 2, 4, 7, 0};
        for (int i = 0; i < 5; i++) {
            int[] a = new int[arrayLength[i]];
            for (int j = 0; j < arrayLength[i]; j++) a[j] = j;
            result.add(a);
        }
        return result;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
