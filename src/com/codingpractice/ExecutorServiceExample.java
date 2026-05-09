package com.test.streams;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsExample {
    private static volatile boolean isOddTurn = true;
    public static void main(String[] args) {

        // write a program to print the even and odd number using thread executor framework
        ExecutorService executors =  Executors.newFixedThreadPool(2);

        Runnable printOdd = () -> {
            for(int i=5;i<=20;i=i+2){
                synchronized(ExecutorsExample.class){
                    while(!isOddTurn){
                        try{
                            ExecutorsExample.class.wait();
                        }
                        catch(InterruptedException e){
                            e.printStackTrace();
                    }
                    }
                    System.out.println("Odd Number: " + i + " " + Thread.currentThread().getName());
                    isOddTurn = false;
                    ExecutorsExample.class.notify();
                }
            }
        };
        Runnable printEven = () -> {
            for(int i=6;i<=20;i=i+2){
                synchronized(ExecutorsExample.class){
                    while(isOddTurn){
                        try{
                            ExecutorsExample.class.wait();
                        }
                        catch(InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Odd Number: " + i + " " + Thread.currentThread().getName());
                    isOddTurn = true;
                    ExecutorsExample.class.notify();
                }
            }
        };

        executors.submit(printOdd);
        executors.submit(printEven);

        executors.shutdown();



    }
}
