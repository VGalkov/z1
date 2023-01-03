package org.example.tests.beansBaseXML.builderLine;

import org.example.helpClasses.Craft;

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
