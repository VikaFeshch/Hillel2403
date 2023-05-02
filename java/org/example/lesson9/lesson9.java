package org.example.lesson9;

public class lesson9 {
    public static void main(String[] args) {
  //      Weather.getWeather(Season.FALL);
        for (Season s:Season.values()){
            System.out.println(s.toString());
        }
    }
}
