package org.example.tests.beansBaseAnnotations.builderLine;

import org.example.helpClasses.Craft;
import org.springframework.stereotype.Component;

@Component("heavyCraftAnnotations")
public class HeavyCraftAnnotations implements CraftBuilderAnnotations {
    protected final static String model = "HeavyCraft";

    @Override
    public Craft work() {
        return new Craft(true, getModel());
    }

    protected String getModel() {
        return model;
    }
}
