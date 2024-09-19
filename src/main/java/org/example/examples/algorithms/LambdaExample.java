package org.example.examples.algorithms;

import org.example.examples.AbstractExampleClass;

import java.util.function.DoubleToIntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaExample extends AbstractExampleClass {

    Predicate<Integer> x = x -> x > 1;
    UnaryOperator<Integer> x1 = x -> x * 3;
    UnaryOperator<Integer> x2 = x -> x / 2;
    TestFunction<Integer> x3 = new TestFunctionImpl();


    @Override
    public void runContent() {
        double v = 2 * x2.apply(3);
        System.out.println(2 * x2.apply(3)); //3
        System.out.println((x1.apply(((Integer) 2 * x2.apply(3)))));
        System.out.println(x3.test((x1.apply(((Integer) 2 * x2.apply(3))))));
    }

}
