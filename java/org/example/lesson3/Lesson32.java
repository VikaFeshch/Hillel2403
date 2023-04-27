package org.example.lesson3;

public class Lesson32 {
    public static void main(String[] args) {
        printInfo("Vika", 45, "female");
    }
    public static void printInfo(String name){
        System.out.println(name);

    }
    public static void printInfo(String name, int age){
        System.out.println(name+" age= "+age);
    }
    public static void printInfo(String name, int age, String sex){
        System.out.println(name+" age= "+age+" sex "+sex);
    }
}
