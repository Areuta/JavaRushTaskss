package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int s = 1;

                if (isNumber(array[j])) {
                    while (j + s < i + 1 && !isNumber(array[j + s])) s++;

                    if (j + s < i + 1 && Integer.parseInt(array[j]) < Integer.parseInt(array[j + s])) {
                        changeIngexes(j, j + s, array);
                    }

                } else {
                    while (j + s < i + 1 && isNumber(array[j + s])) s++;

                    if (j + s < i + 1 && isGreaterThan(array[j], array[j + s])) {
                        changeIngexes(j, j + s, array);
                    }

                }


            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static void changeIngexes(int i, int j, String[] array) {
        String bfr = array[i];
        array[i] = array[j];
        array[j] = bfr;
    }

    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-')) // не цифра и не начинается с '-'
            {
                return false;
            }
        }
        return true;
    }
}
