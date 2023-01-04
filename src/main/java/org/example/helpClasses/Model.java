package org.example.helpClasses;

import java.io.Serializable;

public class Model implements Serializable {

    private static final long serialVersionUID = 42L;
    private String name;
    private transient String str;

    public Model(String name, String str) {
        this.name = name;
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
