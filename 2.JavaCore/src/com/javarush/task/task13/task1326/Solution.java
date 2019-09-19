package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fileInputStream);
        ArrayList<Integer> arrayList = new ArrayList<>(fileInputStream.available());

        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i % 2 == 0) arrayList.add(i);
        }
        Collections.sort(arrayList);

        for (int i : arrayList) System.out.println(i);

        fileInputStream.close();
    }
}
