package org.example.Lesson11;

import java.util.*;

public class hw10_from_lecturer {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(12, "John");
        map.put(16, "Selena");
        map.put(-20, "Kon");
        map.put(2, "Karol");
        printSortedMap(map);
        printSortMap(map);
    }

    public static void printSortMap(Map<Integer,String> map){
        Map<Integer,String> newMap=new TreeMap<>(map);
        for(Map.Entry<Integer,String> l:newMap.entrySet()){
            System.out.println(l.getKey() + " = " + l.getValue());
        }
    }
    public static void printSortedMap(Map<Integer,String> map){
        Set<Integer> integerSet=new TreeSet<>(map.keySet());
        for(Integer integer:integerSet){
            System.out.println(integer + " = " + map.get(integer));
        }
    }
}
