package org.example.lesson9;

public enum Season {
    WINTER("snowing", 5, true), SPRING("flowering"), SUMMER("sunny"), FALL("clouding");
    String sinoptic;
    int i;
    boolean b;

    Season(String sinoptic) {
        this.sinoptic = sinoptic;
    }

    Season(String sinoptic, int i, boolean b) {
        this.sinoptic=sinoptic;
        this.i=i;
        this.b=b;
    }

    public String getSinoptic() {
        return sinoptic;
    }

    public int getI() {
        return i;
    }

    public boolean isB() {
        return b;
    }

    @Override
    public String toString() {
        return "In "+this.name();
    }
}
