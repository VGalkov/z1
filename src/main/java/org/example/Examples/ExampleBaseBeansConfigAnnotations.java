package org.example.Examples;

import org.example.helpClasses.Craft;
import org.example.Examples.beansBaseAnnotations.ApplicationConfig;
import org.example.Examples.beansBaseAnnotations.CraftFactoryAnnotations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleBaseBeansConfigAnnotations extends AbstractExampleClass {


    @Override
    public void runContent() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        CraftFactoryAnnotations craftFactoy = context.getBean("craftFactoryAnnotations", CraftFactoryAnnotations.class);
        craftFactoy.setBuildNumber(4);

        craftFactoy.run();
        List<Craft> carList = new ArrayList<>();

        if (craftFactoy.getCrafts() != null )
            carList.addAll(craftFactoy.getCrafts());

        System.out.println(context.getBeanDefinitionCount());
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        carList.forEach(car -> System.out.println(car + " " + car.getModel() + " " + car.isExists()));
    }
}
