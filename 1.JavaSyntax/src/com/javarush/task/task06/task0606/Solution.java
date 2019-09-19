package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i : r.readLine().toCharArray()) {
            System.out.println(i);
            int a = i % 2 == 0 ? even++ : odd++;
            System.out.println(a);
        }
        System.out.println("Even: " + even + " Odd: " + odd);

//        for (char i = '1'; i < 70; i++) {
//            System.out.print(i + " ");
//        }
    }
}