package org.example.examples.threads;

import org.example.examples.AbstractExampleClass;

import java.util.HashSet;
import java.util.Set;

public class ExampleSteps2 extends AbstractExampleClass {
    private static final String str = "str";
    private static volatile int pointer = 0;
    private static int legIndexMax = 0;
    private static final int MAX_LEGS = 40;

    @Override
    public void runContent() {
        Set<Thread> legs = new HashSet<>();
        for (int i = 0; i < MAX_LEGS; i++)
            legs.add(new Thread(new Foot(String.valueOf(i), i)));

        legIndexMax = legs.size() - 1;

        legs.forEach(Thread::start);
    }


    private static class Foot implements Runnable {

        private final String name;
        private final int id;

        public Foot(String name, int id) {
            this.name = name;
            this.id = id;
        }

        private void doStep() throws InterruptedException { //minimal, not optimal
            synchronized (str) {
                if (this.id == pointer) {
                    System.out.println("leg number " + this.name + " make step" + this);
                    pointer = pointer + 1 > legIndexMax ? 0 : pointer + 1;
                }
            }
        }

        @Override
        public void run() {
            while (true) {
                try {
                    doStep();
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }


}
