package com.codingpractice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrintEvenOddNumberByThread {

    private static volatile boolean isOddTurn = true;

    public static void main(String[] args) {
        // Create two threads, using Executor framework and try to print oddNumber with one thread and
        // Another thread will print the even numbers one by one

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable printOdd = () -> {
            for (int i = 6; i<=20; i=i+2){
                synchronized (PrintEvenOddNumberByThread.class){
                    while (!isOddTurn){
                        try {
                            PrintEvenOddNumberByThread.class.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(" Odd Numbers: " + " - " + Thread.currentThread().getName() );
                    isOddTurn = false;
                    PrintEvenOddNumberByThread.class.notify();

                }
            }

        };
        Runnable printEven = () -> {
            for (int i = 6; i<=20; i=i+2){
                synchronized (PrintEvenOddNumberByThread.class){
                    while (!isOddTurn){
                        try {
                            PrintEvenOddNumberByThread.class.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    System.out.println(" Even Numbers: " + " - " + Thread.currentThread().getName() );
                    isOddTurn = true;
                    PrintEvenOddNumberByThread.class.notify();

                }
            }

        };
        executor.submit(printOdd);
        executor.submit(printEven);
    }
}
