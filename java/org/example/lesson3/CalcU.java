package org.example.lesson3;

public class CalcU {
    public static float calculate(int number1, int number2, String symbol) {
        float result=0;
        switch (symbol) {
            case "+":
                result = sum(number1, number2);
            break;
            case "-":
                result = dif(number1,number2);
            break;
            case "/":
                result = quot(number1,number2);
            break;
            case "*":
                result = prod(number1,number2);
                break;
            case "%":
                result = perc(number1,number2);
                break;
            default:
                System.out.println("Error");
                System.exit(0);
        }
        return result;
    }
    //addition
    private static int sum(int number1, int number2) {
        return number1 + number2;
    }
    //subtraction
    private static int dif(int number1, int number2) {
        return number1 - number2;
    }
    //division
    private static float quot(float number1, int number2) {
        float reserv_result=0;
        if(number2!=0) {
            reserv_result=number1 / number2;
            System.out.println(number1);
        } else {
            System.out.println(" We cannot divide by 0");
            System.exit(0);
        }
        return reserv_result;
    }
    //multiplication
    private static int prod(int number1, int number2) {
        return number1 * number2;
    }
    //percent
    private static float perc(float number1, int number2){
        return (number1/100)*number2;
    }
}
