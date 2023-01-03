package org.example.tests.beansBase.builderLine;

import org.example.tests.beansBase.Craft;

public class HeavyCraft implements  CraftBuilder {
    protected final static String model = "HeavyCraft";

    @Override
    public Craft work() {
        return new Craft(true, getModel());
    }

    protected String getModel() {
        return model;
    }
}
