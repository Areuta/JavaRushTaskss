package com.javarush.task.task13.task1304;

/* 
Selectable и Updatable
*/

public class Solution {
    private static int count;
    public static void main(String[] args) throws Exception {
        System.out.println(count);
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    static class Screen implements Selectable, Updatable {
        public void refresh(){};
        public void onSelect(){};

    }
}
