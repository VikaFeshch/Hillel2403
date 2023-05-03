package org.example.lesson7;

public interface SUMSUNG {

    public default double getTemperature() {
        return 10.0;
    }

    boolean powerOff();
    void sumsungMethod();
}
