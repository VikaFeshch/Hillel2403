package org.example.lesson9;

public class lesson9 {
    public static void main(String[] args) {
  //     Weather.getWeather(Season.FALL);
        for (Season s:Season.values()){
            System.out.print(s.toString()+" ");
            System.out.print(s.getI()+" ");
            System.out.println(s.isB());
            System.out.println(s.ordinal());
        }
    }
}
