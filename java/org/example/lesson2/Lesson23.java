package org.example.lesson2;

import java.util.Random;

public class Lesson23 {
    public static void main(String[] args) {
        int length = 20;
        int[] mass = new int[length];
        Random random = new Random();
        for (int i=0;i < mass.length;i++) {
            mass[i]= random.nextInt(100);
        }
        printMassive(mass);
        //  int[] mass = new int[]{1, 2, 3, 6, 5, 4, 7, 89, 5, 44, 15};
 /*       System.out.println("length mass " + mass.length);
        for (int i = 0; i < mass.length; i++) {
            System.out.println(i + " elem = " + mass[i]);
        }
        for (int i = 0; i < mass.length; ++i) {
            if (mass[i]%2==0) {
                System.out.println(i + " elem = " + mass[i]);
            }
        }
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.println(i + " elem = " + mass[i]);
            if (mass[i]>80){
                break;
            }
        }*/
    }//main
    public static void printMassive(int[] massive) {
        for (int i: massive){
            System.out.print (i+" ");
        }
    }
}
