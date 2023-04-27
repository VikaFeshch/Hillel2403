package org.example.Lesson5;

import org.example.lesson42.Animal;
import org.example.lesson42.Bird;
import org.example.lesson42.Mamal;
import org.example.lesson42.Tiger;

public class lesson5 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tommy", 5, true, "red",80,"pop");
        tiger.printName();
        Mamal mamal=new Mamal("Spyke",5,false,"green",12);
        mamal.printName();
        Bird bird=new Bird("kol", 5,true,"green");
        System.out.println(mamal);
        System.out.println(tiger);
        System.out.println(bird);
        printInfo(tiger);
        printInfo(bird);

    }

    public static void printInfo(Animal animal){
        animal.printName();
    }
}
