package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String objString = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        url = beginEndString(url, '?', false);

        StringTokenizer stringTokenizer = new StringTokenizer(url, "&");
        String parsedString = "";

        while (stringTokenizer.hasMoreElements()) {
            String newQuery = stringTokenizer.nextToken();
            String queryParametr = beginEndString(newQuery, '=', true);
            if ("obj".equals(queryParametr)) objString = newQuery;
            parsedString = String.join(" ", parsedString, queryParametr);
        }
        System.out.println(parsedString);

        if (! (objString == null)) {
            String valueString = beginEndString(objString, '=', false);
            try {
                alert(Double.parseDouble(valueString));
            }
            catch (Exception e) {
                alert(valueString);
            }


        }

    }

    public static String beginEndString(String str, Character ch, boolean beginString) {
        int n = str.indexOf(ch.toString());
        if (n < 0) return str;
        if (beginString) return str.substring(0, n);
        else return str.substring(n + 1);
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
