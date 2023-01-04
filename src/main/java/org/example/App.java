package org.example;

import org.example.tests.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<ExampleClass> exampleClassList = new ArrayList<>();

        exampleClassList.add(new ExampleStreamMap());
        exampleClassList.add(new ExampleBigDecInMap());
        exampleClassList.add(new ExampleObjectInMap());
        exampleClassList.add(new ExampleBaseBeansConfigXML());
        exampleClassList.add(new ExampleBaseBeansConfigAnnotations());
        exampleClassList.add(new ExampleSerialisation());
        exampleClassList.add(new ExampleSorting());


        exampleClassList.forEach(ExampleClass::runTest);

    }
}
