package org.example.tests;

import org.example.helpClasses.ExampleClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamMap extends CommonExampleClass {

    @Override
    public void runContent() {
        List<ExampleClass> list = new ArrayList<ExampleClass>();

        list.add(new ExampleClass("1", "11"));
        list.add(new ExampleClass("2", "22"));
        list.add(new ExampleClass("3", "33"));

        List<String> printList = list.stream()
                .filter(item -> item.getOne().equals("1"))
                .map(ExampleClass::getTwo)
                .filter(two -> two.equals("11"))
                .collect(Collectors.toList());

        printList.forEach(System.out::println);
    }
}
