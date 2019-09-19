package com.javarush.task.MyPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class ITS {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int count = 0, divider  = 1, number = 0;
        while (count < N)
        {
            if (number%divider == 0){
                System.out.print(number + " ");
                count++;
            }
            number++;
            if ((number + "").length() > divider) {
                divider++;
                System.out.println();
            }
        }



    }
}
