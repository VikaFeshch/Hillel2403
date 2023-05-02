package org.example.lesson9;

public class Weather {
 /*   public static void getWeather(String season){
        switch (season){
            case "winter":
                System.out.println("-15");
                break;
            case "summer":
                System.out.println("+35");
                break;
            case "spring":
                System.out.println("+10");
                break;
            default:
                System.out.println("Unknowing");
        }
    }

  */
    public static void getWeather(Season season){
        switch (season){
            case SPRING -> {
                System.out.println("+10");
                System.out.println(season.getSinoptic());
            }
            case FALL -> {
                System.out.println("+8");
                System.out.println(season.getSinoptic());
            }
            case SUMMER -> System.out.println("+35");
            case WINTER -> System.out.println("-15");
            default -> System.out.println("Unknowing");
        }
    }
}
