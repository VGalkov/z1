package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ExampleCollections2 extends AbstractExampleClass {

    private static final List<Integer> integerList = Arrays.asList(0,1,2,3,4);
    private static final  int returnPosition = 2;
    @Override
    public void runContent() {
        for (int i = 0; i < integerList.size(); i++) {
            System.out.println(integerList.get(i));
            if (i == integerList.size() - 1)
                i = returnPosition;
        }
    }
}
