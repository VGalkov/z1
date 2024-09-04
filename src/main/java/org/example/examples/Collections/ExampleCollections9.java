package org.example.examples.Collections;

import org.example.examples.AbstractExampleClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */

public class ExampleCollections9 extends AbstractExampleClass {

    Integer[] arr = {2, 7, 11, 15};
    List<Integer> list = Arrays.asList(arr);
    private final static Integer target = 9;

    @Override
    public void runContent() {
        Integer firstDigit = 0;
        Integer secondDigit = 0;

        for (int i = 0; i < list.size(); i++) {
            firstDigit = list.get(i);
            secondDigit = target - firstDigit;
            if (list.indexOf(secondDigit) > i)
                break;
        }
        System.out.println(Arrays.asList(list.indexOf(firstDigit), list.indexOf(secondDigit)));
    }

}
