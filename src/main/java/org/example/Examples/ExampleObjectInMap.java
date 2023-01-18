package org.example.Examples;

import org.example.helpClasses.ExampleClass;

import java.util.HashMap;
import java.util.Map;

public class ExampleObjectInMap extends AbstractExampleClass {

    @Override
    public void runContent() {
        ExampleClass exampleClass = new ExampleClass("8", "888");
        Map<String, ExampleClass> params = new HashMap<>();

        params.put("key1", exampleClass);

        ExampleClass nn = params.get("key1");

        nn.setOne("42");

        System.out.println(((ExampleClass)params.get("key1")).getOne());
        System.out.println(nn.getOne());
    }
}
