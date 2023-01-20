package org.example.examples.threads;

import org.example.examples.AbstractExampleClass;

import java.util.Arrays;

import static java.lang.Thread.sleep;

public class ExampleThreadRun1 extends AbstractExampleClass {
    private static final int MAX_NUMBER = 8; // Integer.MAX_VALUE/100000;

    @Override
    public void runContent() {
        System.out.println("");
        Thread thread1 = new MyThread(100);

        MyRunnable myRunnable = new MyRunnable(200);
        Thread thread2 = new Thread(myRunnable);

        // -----
        thread1.setPriority(1);
        thread2.setPriority(10);


        // -----
        thread1.start();
        thread2.start();

    }



    private class MyThread extends Thread {
        private int     timeout;

        MyThread(int timeout) {
            super();
            this.timeout = timeout;
        }

        @Override
        public void run(){
            for (int i=0; i < MAX_NUMBER; i++) {
                try {
                    sleep(timeout);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " выкинул  InterruptedException" + Arrays.toString(e.getStackTrace()));
                }
                System.out.println(Thread.currentThread().getName() + " моё число - " + i);
            }
        }
    }

    private class MyRunnable implements Runnable {
        private int timeout;

        MyRunnable(int timeout) {
            this.timeout = timeout;
        }

        @Override
        public void run() {
            for (int i=0; i < MAX_NUMBER; i++) {
                try {
                    sleep(timeout);
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " выкинул  InterruptedException" + Arrays.toString(e.getStackTrace()));
                }
                System.out.println(Thread.currentThread().getName() + " моё число - " + i);
            }
        }
    }
}
