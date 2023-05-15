package org.example.lesson12;

public class lesson12 {
    // Метод приймає два цілих числа
    // і повертає результат поділу
    // Перше на друге
    static float divide ( int x, int y ) {
        float result = x/y;
        return result;
    }
    public static void main ( String args []) {
        int x = 4 ;
        int y = 2 ;
        try {
            // Цей рядок буде виконано
            System. out . println ( divide ( x, y )) ;
            x = 0 ;
            // Ця теж
            System. out . println ( divide ( x, y )) ;
            x = 4 ;
            y = 0 ;
            // Ця викине виняток
            System. out . println ( divide ( x, y )) ;
        } catch ( ArithmeticException e ) {
            System. out . println ( " Помилка при розподілі " + x + " на " + y ) ;
        }
    }
}
