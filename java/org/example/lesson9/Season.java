package org.example.lesson9;

public enum Season {
    WINTER("snowing"), SPRING("flowering"), SUMMER("sunny"), FALL("clouding");
    String sinoptic;

    Season(String sinoptic) {
        this.sinoptic = sinoptic;
    }

    public String getSinoptic() {
        return sinoptic;
    }
}
