package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        Person person = null;
        String sex, name;
        Date date;
        SimpleDateFormat simpleDateFormatInput = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        int positionFirst = 1; int id;

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    while (positionFirst < args.length) {
                        name = args[positionFirst];
                        date = simpleDateFormatInput.parse(args[positionFirst + 2]);
                        if ("м".equals(args[positionFirst + 1])) person = Person.createMale(name, date);
                        if ("ж".equals(args[positionFirst + 1])) person = Person.createFemale(name, date);
                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);
                        positionFirst += 3;
                    }
                }
            case "-u":
                synchronized (allPeople) {
                    while (positionFirst < args.length) {
                        id = Integer.parseInt(args[positionFirst]);
                        person = allPeople.get(id);
                        person.setName(args[positionFirst + 1]);
                        if ("м".equals(args[positionFirst + 2])) person.setSex(Sex.MALE);
                        if ("ж".equals(args[positionFirst + 2])) person.setSex(Sex.FEMALE);
                        date = simpleDateFormatInput.parse(args[positionFirst + 3]);
                        person.setBirthDay(date);
                        positionFirst += 4;
                    }
                }
            case "-d":
                synchronized (allPeople) {
                    while (positionFirst < args.length) {
                        id = Integer.parseInt(args[positionFirst]);
                        person = allPeople.get(id);
                        person.setBirthDay(null);
                        person.setName(null);
                        person.setSex(null);
                        positionFirst++;
                    }

                }
            case "-i":
                synchronized (allPeople) {
                    while (positionFirst < args.length) {
                        id = Integer.parseInt(args[positionFirst]);
                        person = allPeople.get(id);

                        SimpleDateFormat simpleDateFormatOutput
                                = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                        String sexOut = null;

                        if (person.getSex().equals(Sex.FEMALE)) sexOut = "ж";
                        if (person.getSex().equals(Sex.MALE)) sexOut = "м";

                        String sOut = person.getName() + " " + sexOut + " ";
                        sOut += simpleDateFormatOutput.format(person.getBirthDay());

                        System.out.println(sOut);
                        positionFirst++;
                    }

                }


        }
    }
}
