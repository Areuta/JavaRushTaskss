package com.javarush.task.MyPackage;


public class IMF {

    private static IMF imf;

    public static IMF getIMF() {
        if (null == imf)
            synchronized (IMF.class) {
            if (null == imf)
                imf = new IMF();
            }
        return imf;
    }

    private IMF() {
    }
}
