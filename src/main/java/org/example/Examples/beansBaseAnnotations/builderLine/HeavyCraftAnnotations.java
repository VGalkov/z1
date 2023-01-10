package org.example.Examples.beansBaseAnnotations.builderLine;

import org.example.helpClasses.Craft;
import org.springframework.stereotype.Component;

@Component("heavyCraftAnnotations")
public class HeavyCraftAnnotations implements CraftBuilderAnnotations {
    protected final static String model = "HeavyCraft";

    @Override
    public Craft work() {
        return new Craft(true, getModel());
    }
    @Override
    public String getModel() {
        return model;
    }
}
