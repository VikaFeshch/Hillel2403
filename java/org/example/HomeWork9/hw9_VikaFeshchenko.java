package org.example.HomeWork9;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class hw9_VikaFeshchenko {
    public static void main(String[] args) {
        String string = "A bug is the consequence/outcome of a coding fault.";
        Set<String> masSet = new TreeSet<>(Arrays.asList(noCharacter(string)));
        for (String l : masSet) {
            System.out.println(capitalize(l));
        }
    }
//finding characters and replacing their
    private static String[] noCharacter(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ',' || str.charAt(i) == '.' || str.charAt(i) == '/') {
                str = str.replace(str.charAt(i), ' ');
            }
        }
        return str.toLowerCase().split(" ");
    }

    //capitalizing the first characters
    public static String capitalize(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
