package org.example.examples;

public class ExampleSingleTone {
    private static ExampleSingleTone instance;

    public ExampleSingleTone() {

    }

    public synchronized ExampleSingleTone getInstance() {
        if (instance == null)
            instance = new ExampleSingleTone();
        return instance;
    }

    public static void main(String[] args) {

    }
}
