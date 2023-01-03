package org.example;

import org.example.tests.TestBigDecInMap;
import org.example.tests.TestClass;
import org.example.tests.TestObjectInMap;
import org.example.tests.TestStreamMap;

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


        testClassList.forEach(TestClass::runTest);

    }
}
