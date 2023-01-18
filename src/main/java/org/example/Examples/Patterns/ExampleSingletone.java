package org.example.Examples.Patterns;

import org.example.Examples.AbstractExampleClass;

import java.util.ArrayList;
import java.util.List;

public class ExampleSingletone extends AbstractExampleClass {


    @Override
    public void runContent() {

        List<MyThread> list = new ArrayList<>();
        MySingleTone mySingleTone = new MySingleTone();
        for(int i = 0; i<10; i++) {
            list.add(new MyThread(mySingleTone.getMySingleTone()));
        }

        list.forEach(Thread::start);
    }

    class MyThread extends Thread {

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

        private volatile MySingleTone mySingleTone;

        private MySingleTone() {
            super();
        }

        public MySingleTone getMySingleTone() {
            if (mySingleTone == null) {
                synchronized (this) {
                    if (mySingleTone == null) {
                        mySingleTone = new MySingleTone();
                    }
                }
            }
            return mySingleTone;
        }
    }
}
