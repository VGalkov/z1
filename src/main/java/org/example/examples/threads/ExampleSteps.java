package org.example.examples.threads;

import org.example.examples.AbstractExampleClass;

import java.util.*;

public class ExampleSteps extends AbstractExampleClass {
    private static final String str = "str";
    private static volatile boolean pointer = true;

    @Override
    public void runContent() {
        Set<Thread> legs = new HashSet<>(Arrays.asList(
                new Thread(new Foot("one")),
                new Thread(new Foot("two"))
        ));

        legs.forEach(Thread::start);
    }


    private static class Foot implements Runnable {

        private final String name;

        public Foot(String name) {
            this.name = name;
        }

        private void doStep() { //minimal, not optimal
            synchronized (str) {
                if ("one".equals(this.name) && pointer || "two".equals(this.name) && !pointer) {
                    System.out.println(this.name + " make step" + this);
                    pointer = !pointer;
                }
                str.notifyAll();
            }
        }

        @Override
        public void run() {
            while (true)
                doStep();
        }
    }


}
