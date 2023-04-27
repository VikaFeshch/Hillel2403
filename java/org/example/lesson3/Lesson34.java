package org.example.lesson3;

import org.example.lesson2.Lesson23;

import java.util.Random;

public class Lesson34 {
    public static void main(String[] args) {
        int[] massive=createMassive(5);
        Lesson23.printMassive(massive);
    }

    public static int[] createMassive(int i) {
        int[] mass = new int[i];
        Random random=new Random();
        for ( int t=0;t<i;t++){
            mass[t]= random.nextInt(-100,100);
        }
        return mass;
    }
 //   public static
}
