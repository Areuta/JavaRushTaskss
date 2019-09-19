package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormatInput = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        Date date;
        Person person;

        if (args[0].equals("-c")) {
            date = simpleDateFormatInput.parse(args[3]);
            if (args[2].equals("м")) allPeople.add(Person.createMale(args[1], date));
            else if (args[2].equals("ж")) allPeople.add(Person.createFemale(args[1], date));
            System.out.println(allPeople.size() - 1);
        }

        if (args[0].equals("-u")) {
            person = allPeople.get(Integer.parseInt(args[1]));
            person.setName(args[2]);

            if (args[3].equals("ж")) person.setSex(Sex.FEMALE);
            else person.setSex(Sex.MALE);

            date = simpleDateFormatInput.parse(args[4]);
            person.setBirthDay(date);
        }

        if (args[0].equals("-d")) {
            person = allPeople.get(Integer.parseInt(args[1]));
            person.setBirthDay(null);
            person.setName(null);
            person.setSex(null);
        }
        if (args[0].equals("-i")) {
            person = allPeople.get(Integer.parseInt(args[1]));
            SimpleDateFormat simpleDateFormatOutput = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

            String sexOut = null;
            if (person.getSex().equals(Sex.FEMALE)) sexOut = "ж";
            if (person.getSex().equals(Sex.MALE)) sexOut = "м";

            String sOut = person.getName() + " " + sexOut + " ";
            sOut += simpleDateFormatOutput.format(person.getBirthDay());

            System.out.println(sOut);
        }


    }
}
