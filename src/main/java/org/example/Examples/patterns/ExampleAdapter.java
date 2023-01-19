package org.example.Examples.patterns;

import org.example.Examples.AbstractExampleClass;

import java.util.LinkedList;
import java.util.List;

public class ExampleAdapter extends AbstractExampleClass {


    @Override
    public void runContent() {
        List<String>list = new LinkedList<>();
        for (int i = 0; i< 5; i++)
            list.add("record - " + i);

        PrintAdapter printAdapter = new PrintAdapter();
        printAdapter.print(list);
    }



    private static class PrintAdapter implements  listPrinter {

        private final Printer printer = new Printer();


        @Override
        public void print(List<String> list) {
            if (!list.isEmpty())
                list.forEach(printer::print);
        }
    }


    private interface listPrinter{
        void print(List<String> list);
    }



    private static class Printer {

        public void print(String page) {
            System.out.println(page);
        }
    }

}
