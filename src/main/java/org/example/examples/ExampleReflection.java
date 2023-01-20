package org.example.examples;

import org.example.helpClasses.Craft;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ExampleReflection extends AbstractExampleClass {

    @Override
    public void runContent() {
        Craft craft = new Craft();
        ReflectionAccess reflectionAccess = new ReflectionAccess();
        reflectionAccess.getItemPrivateMethod(craft);

    }


    static class ReflectionAccess {

        public void getItemPrivateMethod(Craft craft) {
            try {
                Method privateMethod = Craft.class.getDeclaredMethod("getValueForReflection");
                privateMethod.setAccessible(true);


                String propertyValue = (String) privateMethod.invoke(craft);
                System.out.println("propertyValue" + propertyValue);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException ex) {
                System.out.println(Arrays.toString(ex.getStackTrace()));
            }
        }

    }
}