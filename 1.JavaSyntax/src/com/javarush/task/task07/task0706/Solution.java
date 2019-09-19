package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static int EvenHouses, OddHouses;
    public static void main(String[] args) throws Exception {
        String message = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] houses = new int[15];
        for (int i = 0; i < 15; i++) houses[i] = Integer.parseInt(reader.readLine());

        for (int i = 0; i < 15; i=i+2){
            EvenHouses += houses[i];
            if (i == 14) break;
            OddHouses += houses[i+1];
        }

        if (EvenHouses > OddHouses) message = "В домах с четными номерами проживает больше жителей.";
        if (EvenHouses < OddHouses) message = "В домах с нечетными номерами проживает больше жителей.";
        if (EvenHouses == OddHouses) message = "Количесво жителей одинаково.";

        System.out.println(message);

    }
}

