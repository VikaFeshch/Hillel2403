package org.example.lesson3;

import java.util.Scanner;

public class hw3_Vika_Feshchenko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter first number");
        int number1 = scanner.nextInt();
        System.out.println("Please, enter second number");
        int number2 = scanner.nextInt();
        System.out.println("Enter symbol");
        String symbol = scanner.next();
        if(symbol.equals("%")) {
            System.out.println(number2 + symbol +" from "+ number1 + " = " + CalcU.calculate(number1, number2, symbol));
        }else {
            System.out.println(number1 + symbol + number2 + "=" + CalcU.calculate(number1, number2, symbol));
        }
    }
}
