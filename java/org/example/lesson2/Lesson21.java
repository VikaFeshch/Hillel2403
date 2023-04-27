package org.example.lesson2;

public class Lesson21 {
    public static void main(String[] args) {
        String str;
        int h = 12;
        if (h <= 12) {
            System.out.println("Good morning");
        } else {
            System.out.println("Good afternoon");
        }
        boolean b = false;
        if (b) {
            System.out.println("Good morning");
        } else {
            System.out.println("Good afternoon");
        }
        str = h < 12 ? "Gd Mg" : "Gd Af";
        System.out.println("str= " + str);
    }
}
