package com.test.examples.practice;

public class ThreadProblemDemo {
    public static void main(String[] args) throws InterruptedException {

        StringBuilder st = new StringBuilder();

        Thread t1 = new Thread(() -> {
            for (int i = 0;i<1000;i++){
                st.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0;i<1000;i++){
                st.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Length: " + st.length());


    }
}
