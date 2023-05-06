package org.example.lesson10;

import java.util.*;

public class Lesson102 {
    public static void main(String[] args) {
        String[] strings=new String[]{"qwe","rty","uio", "uio"};//create massive
        Set<String> ss=new TreeSet<>(Arrays.asList(strings));//create collection Set
        System.out.println("%%%%"+ss);

        List<String> stringList=new ArrayList<>(Arrays.asList(strings));//create collection List
        stringList.add("lkj");
        stringList.addAll(stringList.size()-1,ss);//add Set to List
        System.out.println("===="+stringList);

        Set<String> stringSet=new HashSet<>(stringList);
        stringSet.add("rty");
        stringSet.add("ghj");
        System.out.println("HashSet from stringList "+stringSet);

        Set<String> ssss=new TreeSet<>(stringList);
        System.out.println("TreeSet ssss"+ssss);
        ssss.add("ijuh");

        List<String> listt=new ArrayList<>(ssss);
        System.out.println("List from TreeSet "+listt);
        ss.add("ijudreh");
        System.out.println("ss"+ss);
        ssss.addAll(ss);
        System.out.println(ssss);
    }
}
