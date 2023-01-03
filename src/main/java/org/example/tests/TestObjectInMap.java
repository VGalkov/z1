package org.example.tests;

import org.example.helpClasses.ExampleClass;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestObjectInMap extends CommonTestClass {

    @Override
    public void runContent() {
        ExampleClass exampleClass = new ExampleClass("8", "888");
        Map<String, ExampleClass> params = new HashMap<String, ExampleClass>();

        params.put("key1", exampleClass);

        ExampleClass nn = params.get("key1");

        nn.setOne("42");

        System.out.println(((ExampleClass)params.get("key1")).getOne());
        System.out.println(nn.getOne());
    }
}
