package com.test.examples.practice;

public class ThreadSafeDemo {

    public static void main(String[] args) throws InterruptedException {

        StringBuilder st = new StringBuilder();

        Object lock = new Object();  // common lock

//        Thread t1 = new Thread(() -> {
//            synchronized (lock) {
//                for (int i = 0; i < 1000; i++) {
//                    st.append("A");
//                }
//            }
//        });

        Thread t1 = new Thread(() -> {
            synchronized ((lock)) {
                for (int i = 0; i < 1000; i++) {
                    st.append("A");
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 1000; i++) {
                    st.append("B");
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Length: " + st.length()); // always 2000
        System.out.println(st.substring(0, 50));
    }
}
