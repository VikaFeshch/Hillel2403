package org.example.HomeWork9;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class hw9_VikaFeshchenko {
    public static void main(String[] args) {
        printUniqWord("milk, milk, beer, water");
    }

//print unique words
    public static void printUniqWord(String string){
        Set<String> masSet = new HashSet<>(Arrays.asList(string.replace(",", "").replace(".","").split(" ")));
        for (String l : masSet) {
            System.out.println(l.substring(0, 1).toUpperCase() + l.substring(1));
        }
    }

}
