package org.example;

import org.example.examples.Collections.*;
import org.example.examples.regular.ExampleRegular1;

/**
 * тут запускаются списком все наследники AbstractExampleClass, ну или по одному.
 */
public class App {
    public static void main(String[] args) {
/*
        Reflections reflections = new Reflections("org.example");
        Set<Class<? extends AbstractExampleClass>> exampleClasses = reflections.getSubTypesOf(AbstractExampleClass.class);

        exampleClasses.forEach(item -> {
                    try {
                        (item.newInstance()).runTest();
                    } catch (InstantiationException | IllegalAccessException e) {
                        System.out.println(Arrays.toString(e.getStackTrace()));
                    }
                });

 */

        (new ExampleCollections14()).runTest();
    }
}
