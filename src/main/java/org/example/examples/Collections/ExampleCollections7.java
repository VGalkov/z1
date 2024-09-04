package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.*;

public class ExampleCollections7 extends AbstractExampleClass {

    @Override
    public void runContent() {
        Set<HashSet> set = new HashSet<>();
        set.add(new HashSet<Integer>(Arrays.asList(1, 2, 3, 4)));
        set.add(new HashSet<Integer>(Arrays.asList(11, 12, 13, 14)));
        set.add(new HashSet<Integer>(Arrays.asList(21, 22, 23, 24)));
        Integer x = 122;
//Collections.binarySearch()
        System.out.println(set.stream().anyMatch(item -> item.stream().anyMatch(digit -> ((Integer) digit) == x)));
   //     System.out.println(set.stream().anyMatch(item -> Collections.binarySearch(((List<Integer>) item), x) == 1 ? true : false));
    }


}
