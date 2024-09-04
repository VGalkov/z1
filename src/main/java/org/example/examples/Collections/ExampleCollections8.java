package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleCollections8 extends AbstractExampleClass {

    Integer[] arr = {0,0,1,2,2,1,3,3,4,4,7}; //как-то через XOR должно решаться  .. не знаю..
    @Override
    public void runContent() {

        System.out.println(
                Arrays.stream(arr)
                        .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                        .entrySet().stream()
                        .filter(item -> item.getValue() == 1)
                        .map(Map.Entry::getKey).findFirst().orElse(-1)
        );
    }


}
