package org.example.examples;

import org.example.helpClasses.ExampleClass;

import java.util.*;
import java.util.stream.Collectors;

public class ExampleStreamMap2 extends AbstractExampleClass {

    @Override
    public void runContent() {
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        map.put(1,new ArrayList<Integer>(Arrays.asList(0,1,2,3,4)));
        map.put(2,new ArrayList<Integer>(Arrays.asList(20,30)));

        map.keySet().forEach(key ->
                map.get(key).forEach(item ->
                        System.out.print("значение: "+item+" -> "+key+"; ")
                )
        );
    }
}
