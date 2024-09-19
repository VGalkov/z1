package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * наибольшая подстрока, содержащая не менее k символов
 */
public class ExampleCollections14 extends AbstractExampleClass {
    @Override
    public void runContent() {
        String str = "abacd";
        int k = 2;
        Map<String, Set<Character>> map = new HashMap<>();
        for (int j = 0; j <= str.length(); j++) {
            for (int i = j + 1; i <= str.length(); i++) {
                String res = new String(Arrays.copyOfRange(str.getBytes(), j, i));
                Set<Character> ch = new HashSet<>();
                for (int c = 0; c < res.length(); c++) {
                    ch.add(res.charAt(c));
                }
                map.put(res, ch);
            }
        }
        System.out.println(map);

        AtomicInteger counter = new AtomicInteger(1);
        map.keySet().forEach(key -> {
            if (map.get(key).size() <= k && counter.get() < key.length()) {
                counter.set(key.length());
            }
        });

        System.out.println(counter.get());
    }

}

