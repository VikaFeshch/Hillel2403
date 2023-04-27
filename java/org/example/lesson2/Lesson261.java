package org.example.lesson2;
import java.util.Random;
public class Lesson261 {
    public static void main(String[] args) {
        int length=10;
        int[] mass=new int[length];
        //Random random=new Random();
        Random random;
        random = new Random();
        while (length>0) {
            mass[length - 1] = random.nextInt(-50, 50);
            //mass[length-1]= random.nextInt(-50, 50);
            length--;
        }
        int i=0;
        while (i< mass.length){
            System.out.print(mass[i]+" ");
            i++;
        }
    }
}
