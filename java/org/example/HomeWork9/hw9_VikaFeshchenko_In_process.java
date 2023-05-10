package org.example.HomeWork9;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class hw9_VikaFeshchenko_In_process {
    public static void main(String[] args) {
    /*    String result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);*/
        String stringL = "milk, milk, beer, water.";
        String string1 = "A bug is the consequence/outcome of a coding fault.";
        System.out.println(stringL);
     //   String[] massive = noCharacter(string);
       printUniqWord(stringL);
       printUniqWord(string1);

    }

    public static void printUniqWord(String string){
        Set<String> masSet = new TreeSet<>(Arrays.asList(noCharacter(string)));
       // System.out.println(Arrays.asList(noCharacter(string)));
        System.out.println("%%" + masSet);
        for (String l : masSet) {
            System.out.println(capitalize(l) + " ");
        }
        System.out.println(" ");
    }
//    finding characters and deleting their
    private static String[] noCharacter(String str) {
     //don't work correct with string1 because delete char and don't add space
        str=str.replace(",", "").replace(".", "").replace("/", "");
     /* don't work with stringL because we will 2 space in result
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '/') {
               // char c = str.charAt(i);
                System.out.println(str.charAt(i));
                str = str.replace(","," ").replace("."," ").replace("/"," ");
                System.out.println("sp" + str.charAt(i) + "sp");
            }
        }*/
        System.out.println("9999 "+str);
        return str.toLowerCase().split(" ");
    }

    //capitalizing the first characters
    public static String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
