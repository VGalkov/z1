package org.example.Examples.patterns;

import org.example.Examples.AbstractExampleClass;

import java.util.ArrayList;
import java.util.List;

public class ExampleSingleton extends AbstractExampleClass {


    @Override
    public void runContent() {

        List<MyThread> list = new ArrayList<>();
        for(int i = 0; i<5; i++) {
            list.add(new MyThread(MySingleTone.getMySingleTone()));
        }

        list.forEach(Thread::start);
    }

    static class MyThread extends Thread {

        private final MySingleTone singleTone;

        public MyThread(MySingleTone mySingleTone) {
            super();
            this.singleTone = mySingleTone;
        }

        @Override
        public void run() {
            System.out.println("пользуюсь - " + singleTone.toString());
        }
    }


    private static class MySingleTone {

        private static volatile MySingleTone mySingleTone;

        private MySingleTone() {
            super();
        }

        public static synchronized MySingleTone getMySingleTone() {
            if (mySingleTone == null) {
                synchronized (MySingleTone.class) {
                    if (mySingleTone == null) {
                        mySingleTone = new MySingleTone();
                    }
                }
            }
            return mySingleTone;
        }
    }
}
