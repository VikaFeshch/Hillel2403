package org.example.lesson7;

public class Pult implements LG,SUMSUNG {
    int volumeRate;
    boolean onPOff;
    public void printInfo(){
        System.out.println("Info");
    }

    @Override
    public void plus() {
        System.out.println("volume +1");
    }

    @Override
    public void minus() {

    }

    @Override
    public boolean powerOn() {
        System.out.println("power On");
        return false;
    }

    @Override
    public boolean powerOff() {
        return false;
    }

    @Override
    public void sumsungMethod() {
        System.out.println("Sumung");
    }
}
