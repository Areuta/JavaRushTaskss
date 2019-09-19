package com.javarush.task.task06.task0605;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.massIndex(weight, height);
    }

    public static class Body {
        public static void massIndex(double weight, double height) {
            double mIndex = weight / (height * height);
            String Message = null;
            if (mIndex < 18.5) Message = "Недовес: меньше чем 18.5";
            if ((mIndex >= 18.5) && (mIndex <= 24.9)) Message = "Нормальный: между 18.5 и 24.9";
            if ((mIndex >= 25) && (mIndex <= 29.9)) Message = "Избыточный вес: между 25 и 29.9";
            if (mIndex >= 30) Message = "Ожирение: 30 или больше";
            System.out.println(mIndex + " " +Message);

        }
    }
}
