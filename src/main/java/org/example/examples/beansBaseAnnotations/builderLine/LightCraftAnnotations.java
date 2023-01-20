package org.example.examples.beansBaseAnnotations.builderLine;

import org.example.helpClasses.Craft;
import org.springframework.stereotype.Component;

@Component("lightCraftAnnotations")
public class LightCraftAnnotations implements CraftBuilderAnnotations {

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
