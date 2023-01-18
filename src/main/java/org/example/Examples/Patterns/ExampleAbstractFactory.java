package org.example.Examples.Patterns;

import org.example.Examples.AbstractExampleClass;

public class ExampleAbstractFactory extends AbstractExampleClass {


    @Override
    public void runContent() {
        EntityFabric entityFabric1 = new HeavyFabric();
        EntityFabric entityFabric2 = new LightFabric();

        String variant = "LARGE";

        if ("LARGE".equals(variant)) {
            System.out.println(entityFabric1.getElement());
            System.out.println(entityFabric1.getItem());

        } else {
            System.out.println(entityFabric2.getElement());
            System.out.println(entityFabric2.getItem());
        }
     }


    static class HeavyFabric implements EntityFabric {

        @Override
        public Item getItem() {
            return new LargeItem();
        }

        @Override
        public Element getElement() {
            return new FastElement();
        }
    }

    static class LightFabric implements EntityFabric {

        @Override
        public Item getItem() {
            return new SmallItem();
        }

        @Override
        public Element getElement() {
            return new SlowElement();
        }
    }


    static class SmallItem implements Item {

        @Override
        public int width() {
            return 1;
        }

        @Override
        public int length() {
            return 1;
        }

        @Override
        public int showSquare() {
            return length() * width();
        }
    }

    static class LargeItem implements Item {

        @Override
        public int width() {
            return 100;
        }

        @Override
        public int length() {
            return 100;
        }

        @Override
        public int showSquare() {
            return length() * width();
        }
    }

    static class SlowElement implements Element {

        @Override
        public int speed() {
            return 1;
        }

        @Override
        public int height() {
            return 1000;
        }

        @Override
        public int getHeightTime() {
            return height()/speed();
        }
    }

    static class FastElement implements Element {

        @Override
        public int speed() {
            return 100;
        }

        @Override
        public int height() {
            return 1000;
        }

        @Override
        public int getHeightTime() {
            return height()/speed();
        }
    }



    interface EntityFabric {
        Item getItem();
        Element getElement();
    }


    interface Item {

        public int width();
        public int length();

        public int showSquare();

    }

    interface Element {

        public int speed();
        public int height();

        public int getHeightTime();

    }

}
