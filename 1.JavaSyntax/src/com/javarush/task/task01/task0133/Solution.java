package com.javarush.task.task01.task0133;

/* 
Не думать о секундах…
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = 0;

        try {
            a = Integer.parseInt(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(getCountSecondsPassedInCurrentHour(a));
    }

    public static int getCountSecondsPassedInCurrentHour(int seconds) {

        return seconds - (seconds / 3600) * 3600;
    }
}