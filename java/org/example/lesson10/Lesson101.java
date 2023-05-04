package org.example.lesson10;

import java.util.ArrayList;

public class Lesson101 {
    public static void main(String[] args) {
/*
//Object collection
        ArrayList list = new ArrayList();
        list.add("hawk");
        list.add(true);
        System.out.println(list); // [hawk, true]
        for (Object l:list){
            if (l instanceof String str){
                System.out.println(str.toUpperCase());
            }
            System.out.println(list.remove(1));
        }
*/
 //String Collection
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        System.out.println(safer.size());//count
        safer.add(String.valueOf(true));
        System.out.println(safer);
        safer.remove("true");
        System.out.println(safer.size());//count
        for (String l:safer){
            System.out.println(l);
        }
    }
}
