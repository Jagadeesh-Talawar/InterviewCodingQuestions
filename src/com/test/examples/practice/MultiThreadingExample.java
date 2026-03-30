package com.test.examples.practice;

class Task extends  Thread{
    public void run(){
        System.out.println(" Running: " + Thread.currentThread().getName());
    }
}
public class MultiThreadingExample {

    public static void main(String[] args) {

        Task t1 = new Task();
        Task t2 = new Task();

        t1.start();
        t2.start();



    }
}
