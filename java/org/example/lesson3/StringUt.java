package org.example.lesson3;

public class StringUt {
    public static void print(String st, String nam){
        System.out.println(nam+" "+st);

    }
    public static void print1(){
        System.out.println("hello!");
    }
    public static int stringInfo(String st){
        int kol=st.length();
        return kol;
    }
    public static String concat(String str1, String str2, String str3){
        return str1+str2+str3;
    }
}
