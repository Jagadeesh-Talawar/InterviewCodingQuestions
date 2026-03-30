package com.test.examples.practice;

import java.util.Arrays;
import java.util.List;

class Resource {
    void use() {}
}
public class DeadlockExample {
    static Resource res1 = new Resource();
    static Resource res2 = new Resource();
    public static void main(String[] args){

    Thread t1 = new Thread(() -> {
        synchronized(res1) {
            System.out.println("Thread 1: Locked res1");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized(res2) {
                System.out.println("Thread 1: Locked res2");
            }
        }
    });

    Thread t2 = new Thread(() -> {
        synchronized(res2) {
            System.out.println("Thread 2: Locked res2");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized(res1) {
                System.out.println("Thread 2: Locked res1");
            }
        }
    });

    t1.start();
    t2.start();


}
}
