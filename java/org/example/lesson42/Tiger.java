package org.example.lesson42;

import java.util.Objects;

public class Tiger extends Mamal {
    private String sex;
    private String masterName;

    public String getMasterName() {
        return masterName;
    }

    public Tiger(String name, int age, boolean predator, String color, int speed, String masterName) {
        super(name, age, predator, color, speed);
        this.masterName = masterName;
    }

    public Tiger(){
        this("v",7,true,"blue",50,"Roy");
    }
    public void printInfo(){
        System.out.println("Tiger info");
    }

    @Override
    public void printName() {
        System.out.println("I am tiger, my name is "+getName());
    }

   @Override
    public boolean equals(Object anObject) {
        if (this == anObject){
            return true;
        }
        return (anObject instanceof Tiger tige)
                && (Objects.equals(this.getName(), tige.getName()))
                && (this.getAge()==tige.getAge())
                &&(this.color.equals((tige.color)));
    }
}
