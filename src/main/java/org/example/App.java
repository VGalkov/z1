package org.example;

import org.example.tests.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        List<TestClass> testClassList = new ArrayList<>();

        testClassList.add(new TestStreamMap());
        testClassList.add(new TestBigDecInMap());
        testClassList.add(new TestObjectInMap());
        testClassList.add(new TestBaseBeansConfigXML());
        testClassList.add(new TestBaseBeansConfigAnnotations());


        testClassList.forEach(TestClass::runTest);

    }
}
