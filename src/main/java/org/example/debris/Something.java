package org.example.debris;

public class Something {

    private final int intVar1;
    private final int intVar2;

    private final Something.Chaild Chaild;


    public Something(int intVar1, int intVar2) {
        this.intVar1 = intVar1;
        this.intVar2 = intVar2;
        this.Chaild = new Chaild(result1());
    }


    public int result1() {
        return intVar1 + intVar2;
    }

    public int result2() {
        return intVar1 * intVar2;
    }

    public int getIntVar1() {
        return intVar1;
    }

    public int getIntVar2() {
        return intVar2;
    }

    public Something.Chaild getChaild() {
        return Chaild;
    }

    private class Chaild {
        private final int i;


        public Chaild(int i) {
            this.i = i;
        }

        public int getI() {
            return i;
        }
    }

}
