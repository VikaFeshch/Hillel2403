package org.example.Lesson11;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class hw10_VikaFeshchenko {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(12, "John");
        map.put(16, "Selena");
        map.put(20, "Kon");
        map.put(2, "Karol");
        printMap(map);
    }

    public static void printMap(Map<Integer, String> map) {
        for (Integer key : new TreeSet<>(map.keySet())) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}
