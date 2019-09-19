package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/*
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        try {
            FileInputStream fileStream = new FileInputStream(fileName);
            Scanner scanner = new Scanner(fileStream);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            fileStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("AAAAAAAAAAAAAAAAA");
        }

    }
}