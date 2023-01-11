package org.example.Examples.Threads;

import org.example.Examples.CommonExampleClass;

import java.util.ArrayList;
import java.util.List;

public class ExampleThreadRun3 extends CommonExampleClass {


    @Override
    public void runContent() {

        List<Thread> threads = new ArrayList<>();
        Resource resource1 = new Resource();

        for (int i = 0; i < 10; i++) {
            threads.add(new MyThread(resource1));
        }

        threads.forEach(Thread::start);


        System.out.println("Поработала каша без защиты от многопоточности - " + ((Resource)resource1).getI());
        //===


        List<Thread> threads2 = new ArrayList<>();
        ResourceSync resource2 = new ResourceSync();

        for (int i = 0; i < 10; i++) {
            threads2.add(new MyThread(resource2));
        }

        threads2.forEach(Thread::start);
        for (Thread thread : threads2) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Поработала каша с защитой от многопоточности - " + resource2.getI());
        //===
    }


    private static class MyThread extends Thread {

        private final Res resource;

        MyThread(Res resource) {
            super();
            this.resource = resource;
        }

        @Override
        public void run() {
            resource.changeI();
        }
    }

    interface Res {
        void changeI();
    }

    static class Resource implements Res {
        private int i;
        public int getI() {
            return i;
        }

        @Override
        public void changeI() {
            i++;
        }
    }

    static class ResourceSync implements Res {
        private int i;
        @Override
        public void changeI() {
            synchronized (this) {
                i++;
            }
        }

        public int getI() {
            return i;
        }
    }

}
