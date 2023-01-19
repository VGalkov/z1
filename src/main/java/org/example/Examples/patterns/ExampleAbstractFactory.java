package org.example.Examples.patterns;

import org.example.Examples.AbstractExampleClass;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExampleAbstractFactory extends AbstractExampleClass {


    @Override
    public void runContent() {
        Map<String, EntityFabric> entityFabricMap = new HashMap<>();
        entityFabricMap.put("Large", new HeavyFabric());
        entityFabricMap.put("Small", new LightFabric());

        String key;
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                key = "Large";
            } else {
                key = "Small";
            }
            EntityFabric entityFabric = entityFabricMap.get(key);
            System.out.println(entityFabric.toString() + ": " + entityFabric.getElement() + " >>>>>> " + entityFabric.getItem());
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
            return height() / speed();
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
            return height() / speed();
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
