package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
ищем повторяющиеся 4е раза в массиве элементы
 */

public class ExampleCollections10 extends AbstractExampleClass {
    Integer[] arr = {0, 9, 9, 11, 11, 11, 11, 0, 1, 2, 2, 2, 2, 1, 3, 3, 3, 3, 3, 4, 8, 8, 8, 4, 7};

    @Override
    public void runContent() {
        // можно проще, но мы пытаемся держать в голове, что у нас в массиве объекты, а не примитивы, что по идее
        //требует передавать "ссылки" на объекты, а не например генерить их заново.
        List<Integer> digitsToCollect = Arrays.stream(arr)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet().stream()
                .filter(item -> item.getValue() == 4)
                .map(Map.Entry::getKey).collect(Collectors.toList());

        List<Integer> res = new ArrayList<Integer>(Arrays.asList(arr));
        res.retainAll(digitsToCollect);

        System.out.println(res);
    }
}
