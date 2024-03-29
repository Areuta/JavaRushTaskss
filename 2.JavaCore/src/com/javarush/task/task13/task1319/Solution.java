package com.javarush.task.task13.task1319;


/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName = reader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
        String line = null;

        do{
            line = reader.readLine();
            bufferedWriter.write(line);
            if ("exit".equals(line)) break;
            bufferedWriter.newLine();
        }
        while (true);

        bufferedWriter.close();

    }
}
