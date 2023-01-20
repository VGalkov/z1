package org.example.examples.patterns;

import org.example.examples.AbstractExampleClass;

public class ExampleState extends AbstractExampleClass {
    @Override
    public void runContent() {
        Context context = new Context();
        Nature nature1 = new SwimmingState();
        Nature nature2 = new FlyingState();

        context.setNature(nature1);
        context.transformation();

        context.setNature(nature2);
        context.transformation();
    }


    private static class Context implements Nature {

        private Nature nature;

        public Nature getNature() {
            return nature;
        }

        public void setNature(Nature nature) {
            this.nature = nature;
        }

        @Override
        public void transformation() {
            this.nature.transformation();
        }
    }

    interface Nature {
        void transformation();
    }

    class SwimmingState implements Nature {

        @Override
        public void transformation() {
            System.out.println("Swimming transformation");
        }
    }

    class FlyingState implements Nature {

        @Override
        public void transformation() {
            System.out.println("Flying transformation");
        }
    }

}
