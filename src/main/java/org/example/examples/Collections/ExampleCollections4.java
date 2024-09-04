package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.*;

public class ExampleCollections4 extends AbstractExampleClass {

    private static final List<Integer> list1 = new LinkedList<>(Arrays.asList(2, 0, 0));
    private static final List<Integer> list2 = new LinkedList<>(Arrays.asList(5, 6, 4));

    @Override
    public void runContent() {
        StringBuilder digitOneStr = new StringBuilder();
        for (int i = list1.size() - 1; i >= 0; i--)
            digitOneStr.append(list1.get(i));

        StringBuilder digitTwoStr = new StringBuilder();
        for (int i = list2.size() - 1; i >= 0; i--)
            digitTwoStr.append(list2.get(i));


        StringBuilder sb = new StringBuilder(
                String.valueOf(Integer.parseInt(digitOneStr.toString()) + Integer.parseInt(digitTwoStr.toString()))
        );
        sb.reverse();

        System.out.println(sb.toString());
    }


}
