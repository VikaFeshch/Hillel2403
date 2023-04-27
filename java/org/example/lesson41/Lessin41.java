package org.example.lesson41;

public class Lessin41 {
    public static void main(String[] args) {
        int i =155;
        Human human = new Human("Vika", i, "female");
        human.printInfo();
        Human human1 = new Human();
        human1.printInfo();
        Human human2=new Human("Vero", 25, "female", true);
        human2.printInfo();
        System.out.println(human2.getName());
    }
}
