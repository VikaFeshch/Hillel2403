package org.example.lesson7;

public class lesson71 {
    public static void main(String[] args) {
        LG pult = new Pult();// var type LG
        SUMSUNG pult1 = new Pult(); // var type SUMSUNG
        Pult pult2=new Pult(); // var type Pult
        lgMethod(pult);
        SumsungMethod(pult1);
        pult2.printInfo();
    }

    private static void lgMethod(LG pult){
        pult.powerOn();
        pult.plus();
    }
    private static void SumsungMethod(SUMSUNG pult){
        pult.sumsungMethod();
    }
}
