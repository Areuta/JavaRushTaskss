package com.javarush.task.MyPackage;

public class OurPresident {
    private static OurPresident president;
    static {
        synchronized (OurPresident.class){
            president = new OurPresident();
        }
    }
    private OurPresident() {
    }
    public static OurPresident getOurPresident() {
        return president;
    }
}
