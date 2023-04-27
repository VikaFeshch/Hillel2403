package org.example.Lesson5;

import org.example.lesson42.Tiger;

public class lesson51 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger("Tommy", 5, true, "red",80,"pop");
        Tiger tiger1 = new Tiger("Tommy", 5, true, "red",80,"pop");
        System.out.println(tiger==tiger1);
        System.out.println(tiger.equals(tiger1));
    }
}
