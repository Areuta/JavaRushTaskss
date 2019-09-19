package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>(10);
        String s = " ", name = " ";
        int id = 0;
        while (true) {
            s = reader.readLine();
            if (s.equals("")) break;
            name = reader.readLine();
            if (name.equals("")) break;

            id = Integer.parseInt(s);
            map.put(name, id);
        }

        for (HashMap.Entry<String, Integer> pair : map.entrySet())
        System.out.println(pair.getValue() + " " + pair.getKey());
    }
}
