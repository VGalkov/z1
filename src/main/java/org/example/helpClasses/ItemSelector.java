package org.example.helpClasses;


public class ItemSelector {
    private static volatile ItemSelector instance;

    private ItemSelector() {
        super();
    }

    public static synchronized ItemSelector getInstance() {
        if (instance == null) {
            synchronized (ItemSelector.class) {
                if (instance == null) {
                    instance = new ItemSelector();
                    return instance;
                }
            }
        }

        return instance;
    }

    public Item getItem(int condition) {
        return condition % 2 == 0 ? new SmallItem() : new LargeItem();
    }

    static class SmallItem implements Item {

        @Override
        public int width() {
            return 0;
        }

        @Override
        public int length() {
            return 0;
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
    }

    public interface Item {

        public int width();

        public int length();

    }
}
