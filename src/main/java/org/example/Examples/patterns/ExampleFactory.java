package org.example.Examples.patterns;

import org.example.Examples.AbstractExampleClass;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ExampleFactory extends AbstractExampleClass {


    @Override
    public void runContent() {

        ItemSelector builder = ItemSelector.getInstance();

        List<ItemSelector.Item> itemList = new LinkedList<>();
        for (int i = 0; i < 100; i++) {
            itemList.add(builder.getItem(i)); //чётные - один тип, нечётные другой.
        }

        if (!itemList.isEmpty())
            itemList.forEach(System.out::println);
    }

}
