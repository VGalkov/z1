package org.example.examples.algorithms;

@FunctionalInterface
public interface TestFunction<T> {

    boolean test(T t);
}
