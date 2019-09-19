package com.javarush.task.MyPackage;

public class ShablSingl {
    private static ShablSingl ourInstance = new ShablSingl();

    public static ShablSingl getInstance() {
        return ourInstance;
    }

    private ShablSingl() {
    }
}
