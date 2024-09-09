package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
/*
 */

public class ExampleCollections11 extends AbstractExampleClass {
    int[] arr = {1, 2, 3, 4, 2, 3, 1, 4, 2};
    int k = 3;

    @Override
    public void runContent() {
        List<Double> items = new LinkedList<>();
        DecimalFormat df = new DecimalFormat("0.0000");

        for (int i = 0; i <= arr.length - k; i++) {
            int tempSumm = Arrays.stream((Arrays.copyOfRange(arr, i, i + k))).sum();
            items.add((double) Math.round((double) tempSumm / (double) k));
        }

        System.out.println(
                items.stream().map(df::format).collect(Collectors.joining(", "))
        );
    }
}
