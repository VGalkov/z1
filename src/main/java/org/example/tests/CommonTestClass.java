package org.example.tests;

abstract class CommonTestClass implements TestClass {

    @Override
    public void runTest() {
        runTitle();
        runContent();
    }

    @Override
    public void runTitle() {
        System.out.println("Прогон примера - " + this.getClass() + ": ");
    }

    @Override
    public void runContent() { }

}
