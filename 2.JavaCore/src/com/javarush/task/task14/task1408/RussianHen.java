package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {
        return 0;
    }

    public String getDescription() {
        return super.getDescription() + " Моя страна - " +
                Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
