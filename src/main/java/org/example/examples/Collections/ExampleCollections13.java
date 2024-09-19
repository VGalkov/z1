package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class ExampleCollections13 extends AbstractExampleClass {

    @Override
    public void runContent() {
        Set<HashSet> set = new HashSet<>();
        set.add(new HashSet<Integer>(Arrays.asList(1, 2, 3, 4)));
        set.add(new HashSet<Integer>(Arrays.asList(11, 12, 13, 14)));
        set.add(new HashSet<Integer>(Arrays.asList(21, 22, 23, 24)));
        Integer x = 12;
        System.out.println(set.stream().anyMatch(item -> item.stream().anyMatch(digit -> Objects.equals(digit, x))));
        //     System.out.println(set.stream().anyMatch(item -> Collections.binarySearch(((List<Integer>) item), x) == 1 ? true : false));

        List<Integer> line = new LinkedList<>();
        set.forEach(line::addAll);
        System.out.println(Collections.binarySearch(line, x) == 1);
    }


}
