package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String GrandFatherName = reader.readLine();
        Cat catGrandFather = new Cat(GrandFatherName, null, null);

        String GrandMotherName = reader.readLine();
        Cat catGrandMother = new Cat(GrandMotherName, null, null);

        String FatherName = reader.readLine();
        Cat catFather = new Cat(FatherName, null, catGrandFather);

        String MotherName = reader.readLine();
        Cat catMother = new Cat(MotherName, catGrandMother, null);

        String SonName = reader.readLine();
        Cat catSon = new Cat(SonName, catMother, catFather);

        String DaughterName = reader.readLine();
        Cat catDaughter = new Cat(DaughterName, catMother, catFather);

        System.out.println(catGrandFather);
        System.out.println(catGrandMother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String FatherName, MotherName;
            if (mother == null) MotherName = ", no mother";
            else MotherName = ", mother is " + mother.name;

            if (father == null) FatherName = ", no father";
            else FatherName = ", father is " + father.name;

            return "Cat name is " + this.name + MotherName + FatherName;

        }
    }

}
