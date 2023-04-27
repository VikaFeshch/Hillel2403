package org.example.lesson2;

import java.util.Random;

public class hw2_Vika_Feshchenko {
    public static void main(String[] args) {
        int sum = 0;

        // creating massive of numbers
        int length = 20;
        int[] massiv = new int[length];
        Random random = new Random();
        while (length > 0) {
            massiv[length - 1] = random.nextInt(100) - 50;
            length--;
        }

        // printing massive of numbers
        System.out.println("Маємо масив чисел: ");
        for (int l : massiv) {
            System.out.print(l + " ");
        }
        System.out.println(" ");

        // counting sum massive of numbers with condition
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] > 5 && massiv[i] < 45) {
                sum = sum + massiv[i];
                //System.out.println("massiv["+i+"] " + massiv[i] + " sum currently " + sum);
            }
        }

        // printing result
        System.out.println("Сума чисел, що більше 5 та менше 45, дорівнює " + sum);

        // printing even numbers of the massive
        System.out.println("Вибірка позитивних парних чисел масиву");
        for (int l : massiv) {
            if (l % 2 == 0 && l > 0) {
                System.out.print(l + " ");
            }
        }
    }
}
