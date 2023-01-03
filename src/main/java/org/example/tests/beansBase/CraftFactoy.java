package org.example.tests.beansBase;

import org.example.tests.beansBase.builderLine.CraftBuilder;

import java.util.ArrayList;
import java.util.List;

public class CraftFactoy {
    private final int carsCount;
    private final CraftBuilder craftBuilder;
    private final List<Craft> crafts = new ArrayList<>();


    public CraftFactoy(int carsCount, CraftBuilder productionLine) {
        this.carsCount = carsCount;
        this.craftBuilder = productionLine;
    }

    private void init() {
        System.out.println("Bean " + this.getClass() + " initialized");
    }

    private void destroy() {
        System.out.println("Bean " + this.getClass() + " destroyed");
    }

    public void run() {
        int carsBuild = 0;
        while (carsCount > carsBuild){
            crafts.add(craftBuilder.work());
            carsBuild++;
        }
    }

    public List<Craft> getCrafts() {
        return crafts;
    }
}
