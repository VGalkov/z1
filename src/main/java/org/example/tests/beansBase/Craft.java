package org.example.tests.beansBase;

public class Craft {
    private final boolean status;
    private final String model;

    public Craft(boolean status, String model) {
        this.status = status;
        this.model = model;
    }

    public boolean isExists() {
        return status;
    }

    public String getModel() {
        return model;
    }
}
