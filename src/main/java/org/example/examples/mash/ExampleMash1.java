package org.example.examples.mash;

import org.example.examples.AbstractExampleClass;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

// https://leetcode.com/problems/two-sum/

public class ExampleMash1 extends AbstractExampleClass {
    public void runContent() {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }


    public int[] twoSum(int[] nums, int target) {
        Set<Integer> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int one = nums[i];
            for (int j = 0; j < nums.length; j++) {
                int two = nums[j];
                if (j != i && one + two == target) {
                    res.add(i);
                    res.add(j);
                }
            }
        }
        int[] r = new int[res.size()];
        AtomicInteger i = new AtomicInteger(0);
        res.forEach(item -> {
            r[i.get()] = (int) item;
            i.incrementAndGet();
        });


        return r;
    }

}
