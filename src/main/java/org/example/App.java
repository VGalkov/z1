package org.example;

import org.example.examples.*;
import org.example.examples.threads.ExampleSteps;
import org.example.examples.threads.ExampleSteps2;
import org.example.examples.threads.ExampleThreadDeadlock;
import org.reflections.Reflections;

import java.util.Arrays;
import java.util.Set;

/**
 * Hello world!
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

        (new ExampleSteps()).runTest();
    }
}
