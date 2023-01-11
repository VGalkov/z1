package org.example.Examples.Threads;

import org.example.Examples.CommonExampleClass;


import static java.lang.Thread.sleep;

public class ExampleThreadDeadlock extends CommonExampleClass {


    @Override
    public void runContent() {
        Resource1 resource1 = new Resource1();
        Resource2 resource2 = new Resource2();

        resource1.res2 = resource2;
        resource2.res1 = resource1;

        MyThread1 t1= new MyThread1();
        MyThread2 t2 = new MyThread2();

        t1.resource1 = resource1;
        t2.resource2 = resource2;

        t1.start();
        t2.start();

    }


    private class MyThread1 extends Thread {
        public Resource1 resource1;

        @Override
        public void run() {
            System.out.println(resource1.getI());
        }
    }

    private class MyThread2 extends Thread {
        public Resource2 resource2;

        @Override
        public void run() {
            System.out.println(resource2.getI());
        }
    }


    // ---
    static class Resource1 {
        public Resource2 res2;

        public synchronized int getI() {
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return res2.returnI();
        }

        public synchronized int returnI() {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;
        }
    }

    static class Resource2 {
        public Resource1 res1;

        public synchronized int getI() {
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return res1.returnI();
        }

        public synchronized int returnI() {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 2;
        }
    }

}
