package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static Planet thePlanet;

    static {
        readKeyFromConsoleAndInitPlanet();
    }

    public static void main(String[] args) {

    }

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String PlanetName = reader.readLine();
            switch (PlanetName) {
                case "sun": {
                    thePlanet = Sun.getInstance();
                    break;
                }
                case "earth": {
                    thePlanet = Earth.getInstance();
                    break;
                }
                case "moon": {
                    thePlanet = Moon.getInstance();
                    break;
                }
                default:
                    thePlanet = null;
            }
            reader.close();
        } catch (IOException e) {

        }

        // implement step #5 here - реализуйте задание №5 тут
    }
}
