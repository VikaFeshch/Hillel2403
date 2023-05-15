package org.example.lesson12;

import java.io.IOException;
import java.util.zip.ZipException;

public class lesson12Exception {
    public static void main(String[] args) {
        int n=0;
  /*      try {
            n = 2 / 0;
        } catch (ArithmeticException e){
            e.printStackTrace();
            n=2/2;
        }
        System.out.println(n);*/


        try {
            exMethod();
        }catch (ZipException e){
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println(e.getMessage());

        }
        System.out.println(n);

        System.out.println("end");

    }


    public static void exMethod() throws IOException{
        throw new ZipException("Hello");

    }
}
