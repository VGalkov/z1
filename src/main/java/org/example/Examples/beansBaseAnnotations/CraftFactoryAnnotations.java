package org.example.Examples.beansBaseAnnotations;

import org.example.helpClasses.Craft;
import org.example.Examples.beansBaseAnnotations.builderLine.CraftBuilderAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class CraftFactoryAnnotations {
    private int buildNumber;
    @Autowired
    @Qualifier("heavyCraftAnnotations")
    private CraftBuilderAnnotations craftBuilder;
    private final List<Craft> crafts = new ArrayList<>();


    public CraftFactoryAnnotations(int buildNumber, CraftBuilderAnnotations productionLine) {
        this.buildNumber = buildNumber;
        this.craftBuilder = productionLine;
    }

    public CraftFactoryAnnotations() {
    }

    private static CraftFactoryAnnotations craftFactoryAnnotations() {
        return new CraftFactoryAnnotations();
    }

    @PostConstruct
    private void init() {
        System.out.println("Bean " + this.getClass() + " initialized");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Bean " + this.getClass() + " destroyed");
    }

    public void run() {
        int carsBuild = 0;
        while (buildNumber > carsBuild) {
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
