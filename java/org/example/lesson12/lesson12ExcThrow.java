package org.example.lesson12;
import java.util.LinkedList;
public class lesson12ExcThrow {

    public static void main(String[] args) {
            LinkedList<String> fruits = new LinkedList<String>();
            fruits.add("apple");
            fruits.add("banana");
            fruits.add("orange");
            fruits.add("mango");
            // Печатает список
            PrintMe(fruits);
            // Выбрасывает исключение
            PrintMe(null);
        }
        public static void PrintMe(LinkedList<String> fruits){
            if (fruits == null){
                throw new NullPointerException("Аргумент не инициализирован");
            }
            System.out.println(fruits);
        }
    }

