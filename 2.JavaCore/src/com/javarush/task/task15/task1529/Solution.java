package com.javarush.task.task15.task1529;

/*
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static Flyable result;

    static {
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

    }

    public static void reset() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String flyObject = reader.readLine();
        if ("helicopter".equals(flyObject)) result = new Helicopter();
        if ("plane".equals(flyObject)) {
            int pasCount = Integer.parseInt(reader.readLine());
            result = new Plane(pasCount);
        }
        reader.close();
    }
}
