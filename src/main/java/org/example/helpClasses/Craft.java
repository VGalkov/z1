package org.example.helpClasses;

public class Craft {
    private final boolean status;
    private final String model;

    public Craft(boolean status, String model) {
        this.status = status;
        this.model = model;
    }

    public Craft() {
        this.status = true;
        this.model = "noNameModel";
    }

    public boolean isExists() {
        return status;
    }

    public String getModel() {
        return model;
    }

    private String getValueForReflection() {
        return "default volume private method returns";
    }

}
