package org.example.HomeWork8;

public class lineSize {
    public static void getSize(Size size) {
        switch (size){
            case SMALL -> System.out.println(size.toString());
            case MEDIUM -> System.out.println(size.toString());
            case LARGE -> System.out.println(size.toString());
            case EXTRA_LARGE -> System.out.println(size.toString());
        }

    }

}
