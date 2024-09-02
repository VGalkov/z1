package org.example.examples.threads;

import org.example.examples.AbstractExampleClass;


import static java.lang.Thread.sleep;

public class ExampleThreadDeadlock extends AbstractExampleClass {


    @Override
    public void runContent() {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        resource1.res = resource2;
        resource2.res = resource1;

        MyThread t1= new MyThread();
        MyThread t2 = new MyThread();

        t1.resource = resource1;
        t2.resource = resource2;

        System.out.println("Make deadLock");

        t1.start();
        t2.start();

    }


    private static class MyThread extends Thread {
        public Resource resource;

        @Override
        public void run() {

            System.out.println(resource.getFirstElement());
        }
    }


    // ---
    static class Resource {
        public Resource res;

        public synchronized int getFirstElement() {
            try {
                sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return res.getSecondElement();
        }

        public synchronized int getSecondElement() {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            return 1;
        }
    }


}
