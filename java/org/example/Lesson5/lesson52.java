package org.example.Lesson5;

import org.example.lesson42.Animal;
import org.example.lesson42.Bird;
import org.example.lesson42.Mamal;
import org.example.lesson42.Tiger;

public class lesson52 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tommy", 5, true, "red",80,"pop");
        Mamal mamal=new Mamal("Spyke",5,false,"green",12);
        Bird bird=new Bird("kol", 5,true,"green");
        Animal[] massive = new Animal[]{tiger,mamal,bird};
        printAgeinDay(massive);

    }
    public static void printAgeinDay(Animal[] animal){
        for (Animal l:animal){
            System.out.println(l.getSumDays());
        }

    }
}
