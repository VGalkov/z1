package org.example.Examples.patterns;

import org.example.Examples.AbstractExampleClass;

public class ExampleFacade extends AbstractExampleClass {
// упрощение структуры действий, общая логика как у декоартора
    @Override
    public void runContent() {
        SequenceFacade sf = new SequenceFacade();
        sf.compile();
    }




    static class SequenceFacade {
        private Thing_3 thing_3 = new Thing_3();
        private Thing_2 thing_2 = new Thing_2();
        private Thing_1 thing_1 = new Thing_1();

        public void compile() {
            thing_1.modeling();
            thing_2.viewing();
            thing_3.controlling();
        }
    }

    static class Thing_1 {
        public void modeling() {
            System.out.println("modeling");
        }
    }

    static class Thing_2 {
        public void viewing() {
            System.out.println("viewing");
        }
    }

    static class Thing_3 {
        public void controlling() {
            System.out.println("controlling");
        }
    }
}
