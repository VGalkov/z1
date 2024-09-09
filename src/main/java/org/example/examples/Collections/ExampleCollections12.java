package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.text.DecimalFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/*
https://leetcode.com/problems/longest-repeating-character-replacement/

полловина условия не понятна.
 */

public class ExampleCollections12 extends AbstractExampleClass {
    String str = "AABABBA";
    int k = 1;

    @Override
    public void runContent() {
        List<Character> list = new ArrayList<>();
        char[] arr = str.toCharArray();
        for (Character c : arr) {
            list.add(c);
        }
        Map<Character, Long> map = list.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));

        final Character[] item = {map.keySet().stream().findFirst().get()};
        final long[] counter = {0};

        map.keySet().forEach(key -> {
            if (map.get(key) > counter[0]) {
                counter[0] = map.get(key);
                item[0] = key;
            }
        });


        System.out.println(counter[0] + k);
    }
}
