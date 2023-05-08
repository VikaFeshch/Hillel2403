package org.example.HomeWork9;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class hw9_VikaFeshchenko_In_process {
    public static void main(String[] args) {
        String string = "A bug is the consequence/outcome of a coding fault.";
        System.out.println(string);
    //    String[] massive = noCharacter(string);
        printUniqWord((string));

    }

    public static void printUniqWord(String string){
        Set<String> masSet = new TreeSet<>(Arrays.asList(noCharacter(string)));
        System.out.println("%%" + masSet);
        for (String l : masSet) {
            System.out.println(capitalize(l) + " ");
        }
        System.out.println(" ");
    }
//    finding characters and replacing their
    private static String[] noCharacter(String str) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '/') {
               // char c = str.charAt(i);
                System.out.println(str.charAt(i));
                str = str.replace(str.charAt(i), ' ');
                System.out.println("sp" + str.charAt(i) + "sp");
            }
        }
        System.out.println(str);
        return str.toLowerCase().split(" ");
    }

    //capitalizing the first characters
    public static String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
