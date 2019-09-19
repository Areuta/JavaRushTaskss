package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> map = new HashMap<String, String>();
        while (true) {
            String town = reader.readLine();
            if ("".equals(town)) break;
            String family = reader.readLine();
            if ("".equals(family)) break;
            map.put(town, family);
        }
        String request = map.get(reader.readLine());
        if (request == null) System.out.println("Нет такого города!");
        else System.out.println(request);
    }
}
