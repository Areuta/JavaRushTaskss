package com.javarush.task.MyPackage;

public class TestSingletn {
    public static void main(String[] args) {
        System.out.println(11111111);
        ShablSingl shablSingl = ShablSingl.getInstance();
        ShablSingl shablSingl1 = ShablSingl.getInstance();
        System.out.println(shablSingl == shablSingl1);

        System.out.println(222222222);
        OurPresident ourPresident = OurPresident.getOurPresident();
        OurPresident ourPresident1 = OurPresident.getOurPresident();
        System.out.println(ourPresident == ourPresident1);

        System.out.println(333333333);
        IMF imf = IMF.getIMF();
        IMF imf1 = IMF.getIMF();
        System.out.println(imf == imf1);
    }
}
