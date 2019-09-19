package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int countSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            try {
                while (!this.isInterrupted()) {
                    System.out.print(countSeconds + " ");
                    Thread.sleep(1000);
                    if (countSeconds == 1) {
                        System.out.println("Марш!");
                        break;
                    }
                    countSeconds--;
                }

            } catch (InterruptedException e) {
                System.out.println("Прервано!");
                ;
            }
        }
    }
}
