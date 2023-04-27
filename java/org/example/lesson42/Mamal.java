package org.example.lesson42;

public class Mamal extends Animal{
    boolean predator;
    String color;
    int speed;

    public Mamal(String name, int age, String color, int speed) {
        super(name, age);
        this.color = color;
        this.speed = speed;
    }

    public Mamal(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public Mamal(String name, int age, boolean predator, String color, int speed) {
        super(name, age);
        this.predator = predator;
        this.color = color;
        this.speed = speed;
    }

    public Mamal(boolean predator, String color, int speed) {
        super("John",5);
        this.predator = predator;
        this.color = color;
        this.speed = speed;
    }
    public void move(){
        System.out.println("I can move");
    }
    @Override
    public void printName() {
        System.out.println("I am mamal, my name is "+getName());
    }

    @Override
    public int getSumDays() {
        return getAge()*365*2;
    }

    @Override
    public String toString() {
        return "Predator "+predator+"\nColor "+color+"\nSpeed "+speed+"\nName "+getName();
    }

}
