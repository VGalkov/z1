package org.example.tests;

import org.example.helpClasses.Craft;
import org.example.tests.beansBaseAnnotations.ApplicationConfig;
import org.example.tests.beansBaseAnnotations.CraftFactoryAnnotations;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBaseBeansConfigAnnotations extends CommonTestClass {


    @Override
    public void runContent() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        CraftFactoryAnnotations craftFactoy = context.getBean("craftFactoyAnnotations", CraftFactoryAnnotations.class);
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
