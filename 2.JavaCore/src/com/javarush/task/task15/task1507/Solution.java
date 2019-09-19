package com.javarush.task.task15.task1507;

/* 
ООП - Перегрузка
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
    public static void printMatrix(){
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }
    public static void printMatrix(int m){
        System.out.println();
    }
    public static void printMatrix(float m){}
    public static void printMatrix(int m, float f){}
    public static void printMatrix(float f, float d){}
    public static void printMatrix(float f, float d, int m){}
    public static void printMatrix(String s){}
    public static void printMatrix(Object o){}

}
