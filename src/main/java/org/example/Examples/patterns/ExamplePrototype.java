package org.example.Examples.patterns;

import org.example.Examples.AbstractExampleClass;
import org.example.helpClasses.Craft;

public class ExamplePrototype extends AbstractExampleClass {

    @Override
    public void runContent() {
        Craft masterClone = new Craft(true, "моделька");
        System.out.println(masterClone + String.valueOf(masterClone.hashCode()));

        //no
        Craft craftClone = masterClone.getCopy();
        System.out.println(craftClone + String.valueOf(masterClone.hashCode()));

        //>>
        CraftCloner craftCloner = new CraftCloner(masterClone);
        Craft craftClone2 = craftCloner.cloneCraft();

        System.out.println(craftClone2 + String.valueOf(masterClone.hashCode()));
    }


    private class CraftCloner {
        Craft craft;

        public CraftCloner(Craft craft) {
            this.craft = craft;
        }

        public void setCraft(Craft craft) {
            this.craft = craft;
        }

        Craft cloneCraft() {
            return craft.getCopy();
        }
    }
}
