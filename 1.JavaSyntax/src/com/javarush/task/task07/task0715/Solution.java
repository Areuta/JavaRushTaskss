package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>(3);
        Collections.addAll(list, "мама", "мыла", "раму");
        for (int i = 0; i < 3; i++) list.add(2 * i + 1, "именно");
        for (String s : list) System.out.println(s);

    }
}
