package org.example.Examples.Treads;

import org.example.Examples.CommonExampleClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Thread.sleep;

public class ExampleThreadRun2 extends CommonExampleClass {


    @Override
    public void runContent() {

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i< 10; i++) {
            threads.add(new MyThread());
        }

        threads.forEach(Thread::start);
    }



    private class MyThread extends Thread {
        private static final int DEFAULT_TIMEOUT = 100;
        private static final int MAX_NUMBER = Integer.MAX_VALUE/100000;
        private final int timeout;

        MyThread() {
            super();
            this.timeout = DEFAULT_TIMEOUT;
        }

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
        private static final int MAX_NUMBER = Integer.MAX_VALUE/100000;
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
