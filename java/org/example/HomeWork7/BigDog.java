package org.example.HomeWork7;

public class BigDog extends Dog{
    public BigDog(String name) {
        super(name);
    }
    //Override greets without parameters
    @Override
    void greets() {
        System.out.println("Woow");
    }
    //Override greets with Dog
    void greets(Dog another){
        System.out.println("Woooow");
    }
    //Override greets with BigDog
    void greets(BigDog another){
        System.out.println("Woooooooow");
    }
}
