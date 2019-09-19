package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = -1, num = 0;
        double sum = 0;

        boolean isExit = false;

        while (!isExit) {
            i = Integer.parseInt(reader.readLine());
            isExit = i == -1;
            if (isExit) break;
            sum += i;
            num++;
        }
        if (!(num == 0)) sum /= num;
        System.out.println(sum);
    }
}

