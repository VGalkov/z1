package org.example;

import org.example.examples.algorithms.Example1;
import org.example.examples.algorithms.LambdaExample;
import org.example.examples.mash.ExampleMash1;
import org.example.examples.mash.ExampleMash2;
import org.example.examples.mash.ExampleMash3;

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

        (new Example1()).runTest();
    }
}
