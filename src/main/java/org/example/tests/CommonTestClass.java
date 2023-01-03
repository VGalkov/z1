package org.example.tests;

public abstract class CommonTestClass implements TestClass {

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
    public void runContent() { }

    @Override
    public void runStopLine() {
        System.out.println("-------------------------");
    }
}
