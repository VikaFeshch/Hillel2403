package org.example.lesson7;

public interface LG {
    void plus();
    void minus();
    boolean powerOn();
    boolean powerOff();

    public default double getTemperature() {
        return 10.0;
    }
}
