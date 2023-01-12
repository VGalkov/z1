package org.example.helpClasses;

public class ParametrisedClass  extends AbstractParams{

    private Boolean a;
    private String b;

    public ParametrisedClass(Boolean a, String b) {
        this.a = a;
        this.b = b;
    }

    public boolean isA() {
        return a;
    }

    public void setA(Boolean a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }


    public <T1> Object returnMe(T1 obj) {
        return obj;
    }

}
