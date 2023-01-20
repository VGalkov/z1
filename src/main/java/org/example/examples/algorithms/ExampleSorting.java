package org.example.examples.algorithms;

import org.example.examples.AbstractExampleClass;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleSorting extends AbstractExampleClass {

    private static final List<Integer> DEFAULT_LIST = Arrays.asList(1,43,12,45,1,56,4,1,1,6,7);
    private List<Integer> data;

    public ExampleSorting(List<Integer> data) {
        this.data = data;
    }

    public ExampleSorting() {
        this.data = DEFAULT_LIST;
    }

    public List<Integer> sort() {
        return sort(data);
    }

    public List<Integer> sort2() {
        return sort2(DEFAULT_LIST);
    }

    public List<Integer> sort2(List<Integer> list) {
        boolean wasSorted = true;
        for (int i =1; i < list.size(); i++) {
            if (list.get(i-1) < list.get(i)) {
                swap(list, i - 1, i);
                wasSorted = false;
            }
        }
        if (!wasSorted) sort(list);
        return list;
    }

    public List<Integer> sort(List<Integer> list) {
        //без проверок на NPE.
        boolean wasSorted = false;
        while (!wasSorted) {
            wasSorted = true;
            for (int i =1; i < list.size(); i++) {
                if (list.get(i-1) < list.get(i)) {
                    swap(list, i - 1, i);
                    wasSorted = false;
                }
            }
        }

        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        list = list.stream().sorted(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }).collect(Collectors.toList());

        return list;
    }


    private void swap(List<Integer> list, int index1, int index2) {
        Integer bufferedNumber = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, bufferedNumber);
    }


    public List<Integer> getData() {
        return data;
    }

    public void setData(List<Integer> data) {
        this.data = data;
    }

    @Override
    public void runContent() {
        System.out.println("Исходник до" + DEFAULT_LIST);

        ExampleSorting exampleSorting = new ExampleSorting();
        List<Integer> list = exampleSorting.sort();
        System.out.println(list);

        List<Integer> list2 = exampleSorting.sort2();
        System.out.println(list2);

        System.out.println("Исходник после" + DEFAULT_LIST);
    }
}
