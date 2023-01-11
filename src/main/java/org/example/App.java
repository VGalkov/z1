package org.example;

import org.example.Examples.*;
import org.example.Examples.Threads.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<ExampleClass> exampleClassList = new ArrayList<>();
        //*
        exampleClassList.add(new ExampleBaseBeansConfigXML());
        exampleClassList.add(new ExampleBaseBeansConfigAnnotations());
        //*
        exampleClassList.add(new ExampleStreamMap());
        exampleClassList.add(new ExampleBigDecInMap());
        exampleClassList.add(new ExampleObjectInMap());
        exampleClassList.add(new ExampleSerialization());
        exampleClassList.add(new ExampleSorting());
        //*
        exampleClassList.add(new ExampleThreadRun1());
        exampleClassList.add(new ExampleThreadRun2());
        exampleClassList.add(new ExampleThreadRun3());
        exampleClassList.add(new ExampleThreadRunVolatile());
        exampleClassList.add(new ExampleThreadDeadlock());
        exampleClassList.add(new ExampleThreadNotyfy());
        exampleClassList.add(new ExampleSemaphore());

        exampleClassList.forEach(ExampleClass::runTest);

    }
}
