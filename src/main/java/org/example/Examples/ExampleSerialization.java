package org.example.Examples;

import org.example.helpClasses.Model;

import java.io.*;
import java.util.Arrays;

public class ExampleSerialization extends AbstractExampleClass {

    private boolean isSerialised = false;
    private Object serialisedObject = null;

    public void serialise(Object object) {
        ObjectOutputStream objectOutputStream = null;
        setSerialised(false);
        setSerialisedObject(object);

        try {
            File file = new File("E:/prj/z1/data/object.dat");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(object);
            setSerialised(true);
        } catch (IOException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        } finally {
            try {
                if (objectOutputStream != null)
                    objectOutputStream.close();
            } catch (IOException e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
    }

    public Model deSerialise() {
        ObjectInputStream objectInputStream = null;
        Model model = null;

        try {
            File file = new File("E:/prj/z1/data/object.dat");
            FileInputStream fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            model = (Model) objectInputStream.readObject();
            setSerialised(true);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        } finally {
            try {
                if (objectInputStream != null)
                    objectInputStream.close();
            } catch (IOException e) {
                System.out.println(Arrays.toString(e.getStackTrace()));
            }
        }
        return model;
    }

    public boolean isSerialised() {
        return isSerialised;
    }

    public void setSerialised(boolean serialised) {
        isSerialised = serialised;
    }

    public Object getSerialisedObject() {
        return serialisedObject;
    }

    public void setSerialisedObject(Object serialisedObject) {
        this.serialisedObject = serialisedObject;
    }

    @Override
    public void runContent() {

        Model model = new Model("AAAAAAAAAAAAA!", "BBBBBBBBBBBB");

        ExampleSerialization exampleSerialisation = new ExampleSerialization();
        exampleSerialisation.serialise(model);
        System.out.println("Объект сериализуем? - " + (isNormalSerialization(exampleSerialisation, model) ? "Да" : "Нет"));

        if (isNormalSerialization(exampleSerialisation, model)) {
            System.out.println("Десериализуем");
            Model deSerialisedModel = exampleSerialisation.deSerialise();
            String sb = "Было - " + model + ": " + model.getName() + " - " + model.getStr() + (System.lineSeparator()) +
                    "Стало - " + deSerialisedModel + ": " + deSerialisedModel.getName() + " - " + deSerialisedModel.getStr() + (System.lineSeparator()) +
                    "Одно и тоже? - " + model.equals(deSerialisedModel);
            System.out.println(sb);
        } else {
            System.out.println("Десериализации не будет - выше какие-то ошибки");
        }
    }

    private boolean isNormalSerialization(ExampleSerialization exampleSerialisation, Model model) {
        return exampleSerialisation.isSerialised() && model.equals(exampleSerialisation.getSerialisedObject());
    }
}
