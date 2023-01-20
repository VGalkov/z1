package org.example.examples;

public abstract class AbstractExampleClass implements ExampleClass {

    @Override
    public void runTest() {
        runTitle();
        runContent();
        runStopLine();
    }

    @Override
    public void runTitle() {
        System.out.println("Прогон примера - " + this.getClass() + ": ");
    }

    @Override
    public void runStopLine() {
        System.out.println("-------------------------");
    }
}
