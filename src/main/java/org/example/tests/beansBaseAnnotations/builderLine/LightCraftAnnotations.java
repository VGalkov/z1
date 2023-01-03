package org.example.tests.beansBaseAnnotations.builderLine;

import org.example.helpClasses.Craft;
import org.springframework.stereotype.Component;

@Component("lightCraftAnnotations")
public class LightCraftAnnotations implements CraftBuilderAnnotations {

    protected final static String model = "LightCraft";

    @Override
    public Craft work() {
        return new Craft(true, getModel());
    }

    protected String getModel() {
        return model;
    }
}
