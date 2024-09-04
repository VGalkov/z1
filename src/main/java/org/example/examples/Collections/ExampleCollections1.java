package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleCollections1 extends AbstractExampleClass {

    @Override
    public void runContent() {
        List<ArrayList> listOfLists = Arrays.asList(
                        new ArrayList<>( Arrays.asList(0,1,2,3,4)),
                        new ArrayList<>( Arrays.asList(10,11,12,13,14)),
                        new ArrayList<>( Arrays.asList(20,21,22,23,24))
        );

        List<Object> summlist = new ArrayList<>();
        listOfLists.forEach(arrayList -> summlist.addAll(arrayList));

        System.out.println(summlist);
    }
}
