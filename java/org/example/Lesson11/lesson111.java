package org.example.Lesson11;

import org.example.lesson41.Human;

import java.util.HashMap;
import java.util.Map;

public class lesson111 {
    public static void main(String[] args) {
        Map<Integer,Human> humans=new HashMap<>();
        humans.put(12345,new Human("Vasiliy",34,"male"));
        humans.put(12346, new Human());
        printInfo(humans);
        printHumanInfo(humans.get(12346));
    }
    public static void printInfo(Map<Integer, Human> humanMap){
        for (Map.Entry<Integer,Human> l:humanMap.entrySet()){
            System.out.println(l.getValue().getName() +" = " + l.getValue().getAge());
        }
    }
    public static void printHumanInfo(Human human){
        human.printInfo();
    }
}
