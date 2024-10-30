package org.example.examples.algorithms;

import org.example.examples.AbstractExampleClass;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Example1 extends AbstractExampleClass {
    public void runContent() {
        //TreeMap treeMap = new TreeMap<>();
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 5, 4, 75, 23, 123, 546, 123, 15, 15);
        l.stream().sorted().distinct().forEach(item -> item++);
        Set<Integer> s = l.stream().filter(integer -> integer > 6).collect(Collectors.toSet());
        System.out.println(s);
    }


}
