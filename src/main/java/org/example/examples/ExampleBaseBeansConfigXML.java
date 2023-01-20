package org.example.examples;

import org.example.helpClasses.Craft;
import org.example.examples.beansBaseXML.CraftFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleBaseBeansConfigXML extends AbstractExampleClass {

    @Override
    public void runContent() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        CraftFactory lightCraftFactory = context.getBean("lightCraftFactory", CraftFactory.class);
        CraftFactory heavyCraftFactory = context.getBean("heavyCraftFactory", CraftFactory.class);

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
