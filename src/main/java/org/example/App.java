package org.example;

import org.example.examples.*;
import org.example.examples.algorithms.ExampleRecursion;
import org.example.examples.algorithms.ExampleSorting;
import org.example.examples.patterns.*;
import org.example.examples.threads.*;

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
        exampleClassList.add(new ExampleThreadNotify());
        exampleClassList.add(new ExampleSemaphore());
        //*
        exampleClassList.add(new ExampleSingleton());
        exampleClassList.add(new ExampleFactory());
        exampleClassList.add(new ExampleAbstractFactory());
        exampleClassList.add(new ExampleDecorator());
        exampleClassList.add(new ExampleFacade());
        exampleClassList.add(new ExampleObserver());
        exampleClassList.add(new ExampleState());
        exampleClassList.add(new ExamplePrototype());

        //*
        exampleClassList.add(new ExampleReflection());
        //exampleClassList.add(new `ExampleFuncInterface`());
        exampleClassList.add(new ExampleRecursion());
        //
        exampleClassList.forEach(ExampleClass::runTest);
    }
}
