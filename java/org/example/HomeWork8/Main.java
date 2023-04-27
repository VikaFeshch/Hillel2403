package org.example.HomeWork8;

public class Main {
    public static void main(String[] args) {
        testCat((new Cat("Trish")));
        testDog(new Dog("Tayson"));
        testBigDog(new BigDog("Tayson"));
        testLion(new Lion( "Alex"));
        testWolf(new Wolf("Akela"));
    }
    private static void testCat(Cat cat){
        cat.greets();
        cat.feed();
        cat.play();
        cat.walk();
    }
    private static void testDog(Dog dog){
        dog.greets();
        dog.greets(new Dog("Trixy"));
        dog.feed();
        dog.walk();
        dog.play();
    }
    private static void testBigDog(Dog bigDog){
        bigDog.greets();
        bigDog.greets(new Dog("Trixy"));
        bigDog.greets(new BigDog("Zakat"));
    }

    private static void testLion(Lion lion){
        lion.greets();
        lion.hunting();
    }
    private static void testWolf(Wolf wolf){
        wolf.greets();
        wolf.hunting();
    }
}
