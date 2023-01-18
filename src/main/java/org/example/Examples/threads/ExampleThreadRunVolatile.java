package org.example.Examples.threads;

import org.example.Examples.AbstractExampleClass;

public class ExampleThreadRunVolatile extends AbstractExampleClass {

    //volatile
                static int i = 0;

    @Override
    public void runContent() {
        new MyReader().start();
        new MyThread().start();
    }


    private static class MyThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            while (i < 10) {
                System.out.println("текущее значение i - " + ++i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    private static class MyReader extends Thread {

        @Override
        public void run() {
            int locI = i;
            while (locI < 10) {
                if (locI != i) {
                    System.out.println("Значение i поменялось на " + i);
                    locI = i;
                }
            }
        }
    }
}
