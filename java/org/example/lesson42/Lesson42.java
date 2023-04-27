package org.example.lesson42;

public class Lesson42 {
    public static void main(String[] args) {
     /*   Animal animal=new Animal("Trish", 5);
        animal.printName();*/
        Bird bird = new Bird("Nusha", 2, true, "green");
        bird.printName();
        bird.fly();
        Mamal mamal=new Mamal(true,"red",5);
        mamal.move();
        Tiger tiger=new Tiger("Tiger",5,true,"red", 50,"Hotr");
        System.out.println(tiger.getMasterName());
        tiger.printInfo();
        printName(bird);

    }
    private static void printName(Animal tiger){
        tiger.printName();
    }
}
