package org.example.tests;

import org.example.tests.CommonTestClass;
import org.example.tests.beansBase.Craft;
import org.example.tests.beansBase.CraftFactoy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBaseBeansConfigXML extends CommonTestClass {

    @Override
    public void runContent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        CraftFactoy lightCraftFactory = context.getBean("lightCraftFactory", CraftFactoy.class);
        CraftFactoy heavyCraftFactory = context.getBean("heavyCraftFactory", CraftFactoy.class);

        lightCraftFactory.run();
        heavyCraftFactory.run();
        List<Craft> carList = new ArrayList<>();

        if (heavyCraftFactory.getCrafts() != null )
            carList.addAll(heavyCraftFactory.getCrafts());

        if (lightCraftFactory.getCrafts() != null )
            carList.addAll(lightCraftFactory.getCrafts());

        System.out.println(context.getBeanDefinitionCount());
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

        carList.forEach(craft -> System.out.println(craft + " " + craft.getModel() + ": " + craft.isExists()));
    }

}
