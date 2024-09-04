package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ExampleCollections3 extends AbstractExampleClass {

    private static final List<Integer> integerList = Arrays.asList(0,1,2,3,4);
    @Override
    public void runContent() {
        List newList1 = new ArrayList<>();
        for (int i = integerList.size()-1; i >= 0; i--) {
            newList1.add(integerList.get(i));
        }
        System.out.println(newList1);

        List newList2 = new ArrayList<>(integerList);
        Collections.reverse(newList2);
        System.out.println(newList2);
    }
}
