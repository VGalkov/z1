package org.example.examples.beansBaseXML.builderLine;

import org.example.helpClasses.Craft;

public class LightCraft implements  CraftBuilder {

    protected final static String model = "LightCraft";

    @Override
    public Craft work() {
        return new Craft(true, getModel());
    }

    @Override
    public String getModel() {
        return model;
    }
}
