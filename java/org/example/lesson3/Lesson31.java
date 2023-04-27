package org.example.lesson3;

public class Lesson31 {
    public static void main(String[] args) {
        System.out.println(sumNumbers("fgh ",2,5,3,5,2,6,8,2,3,3,6,5,8,5));
    }
    public static int sumNumbers(int... numbers){
        int sum = 0;
        for (int i : numbers){
            sum = sum+i;
        }
        return sum;
    }
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers){
            sum = sum+i;
        }
        return sum;
    }

    public static int sumNumbers(String in, int ...numbers){
        int sum = 0;
        for (int i : numbers){
            sum = sum+i;
        }
        return sum;
    }
}
