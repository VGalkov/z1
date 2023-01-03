package org.example.tests.beansBaseXML;

import org.example.helpClasses.Craft;
import org.example.tests.beansBaseXML.builderLine.CraftBuilder;

import java.util.ArrayList;
import java.util.List;

public class CraftFactoy {
    private int buildNumber;
    private CraftBuilder craftBuilder;
    private final List<Craft> crafts = new ArrayList<>();


    public CraftFactoy(int buildNumber, CraftBuilder productionLine) {
        this.buildNumber = buildNumber;
        this.craftBuilder = productionLine;
    }

    public CraftFactoy() {
    }

    private static CraftFactoy factory() {
        return new CraftFactoy();
    }

    private void init() {
        System.out.println("Bean " + this.getClass() + " initialized");
    }

    private void destroy() {
        System.out.println("Bean " + this.getClass() + " destroyed");
    }

    public void run() {
        int carsBuild = 0;
        while (buildNumber > carsBuild){
            crafts.add(craftBuilder.work());
            carsBuild++;
        }
    }

    public List<Craft> getCrafts() {
        return crafts;
    }

    public void setBuildNumber(int size) {
        this.buildNumber = size;
    }
}
