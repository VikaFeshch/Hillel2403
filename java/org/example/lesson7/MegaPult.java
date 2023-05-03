package org.example.lesson7;

public interface MegaPult extends LG,SUMSUNG{
    void youtube();
    void netFlex();

    @Override
    default void plus() {

    }

    @Override
    default void minus() {

    }

    @Override
    default boolean powerOn() {
        return false;
    }

    @Override
    default boolean powerOff() {
        return false;
    }

    @Override
    default double getTemperature() {
        return SUMSUNG.super.getTemperature();
    }

    @Override
    default void sumsungMethod() {

    }
}
