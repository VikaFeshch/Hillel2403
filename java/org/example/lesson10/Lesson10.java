package org.example.lesson10;

import java.util.Arrays;

public class Lesson10 {
    public static void main(String[] args) {
        String string="animals";
        System.out.println(string.substring(3,7));
        System.out.println(string);
        String str=capitalize(string);
        System.out.println(str);
        String sentence = "Hello my dear friend!";
        String[] words = sentence.split("e");
        System.out.println(Arrays.toString(words));
        for (String l:words){
            System.out.println(l);
        }
//        System.out.println(sub(string));
    }
/*    public static String sub(String str){
        return str.substring(3);
    }*/
    public static String capitalize(String string){
       return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
