package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader readerr = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = readerr.readLine();
            secondFileName = readerr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

//        firstFileName = "D:\\new 1.txt";
//        secondFileName = "C:\\Users\\Антон\\Desktop\\JavaHotKeys.txt";
    }
    public static void main(String[] args) throws InterruptedException {

        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String fileName;
        public String fileContent = "";
        @Override
        public void setFileName(String fullFileName) {
            fileName = fullFileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }

        @Override
        public void run() {
            String bfrFileContent = "", line = "";
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));

                while (reader.ready() && (line = reader.readLine()) != null ) {
                    bfrFileContent +=line + " ";
                }
                reader.close();

            } catch (IOException e) {
//                e.printStackTrace();
            }
            fileContent = bfrFileContent;
        }
    }
}
