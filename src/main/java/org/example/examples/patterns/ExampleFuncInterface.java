package org.example.examples.patterns;

import org.example.examples.AbstractExampleClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExampleFuncInterface extends AbstractExampleClass {
    @Override
    public void runContent() {
        System.out.println(func(str -> str.toLowerCase(), "aKLsmasHM")); // 1
        System.out.println(func(String::toLowerCase, "aKLsmasHM")); //2

        System.out.println(this.getClass() + ": " +
                (new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9)))
                        .stream()
                        .map(new FuncInterface()).collect(Collectors.toList())
        );
    }


    private static class FuncInterface implements Function<Integer, String> {

        @Override
        public String apply(Integer i) {
            return Integer.toString(i * i);
        }
    }



        static String func(Iface1 i, String str) {
            return i.fn(str);
        }

    interface Iface1 {
        String fn(String str);
    }
}
