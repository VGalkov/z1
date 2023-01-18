package org.example.Examples.patterns;

import org.example.Examples.AbstractExampleClass;

public class ExampleFactory extends AbstractExampleClass {


    @Override
    public void runContent() {

        ItemSelector builder = new ItemSelector();
        Item i1 = builder.getItem(1);
        Item i2 = builder.getItem(42);

        System.out.println(i1.toString());
        System.out.println(i2.toString());
    }

    class ItemSelector {
        Item item;

        public Item getItem(int condition) {
            switch (condition) {
                case 1:
                    item = new smallItem();
                    break;
                default:
                    item = new largeItem();
                    break;
            }

            return item;
        }
    }


    class smallItem implements Item {

        @Override
        public int width() {
            return 0;
        }

        @Override
        public int length() {
            return 0;
        }
    }

    class largeItem implements Item {

        @Override
        public int width() {
            return 100;
        }

        @Override
        public int length() {
            return 100;
        }
    }

    interface Item {

        public int width();
        public int length();

    }

}
