package org.example.lesson42;

public class Bird extends Animal{
    private boolean isFly;
    private String colorF;

    public Bird(){};
    public Bird(String name, int age, boolean isFly, String colorF) {
        super(name, age);
        this.isFly = isFly;
        this.colorF = colorF;
    }

    public void fly(){
        System.out.println(isFly?"I "+getName()+" can fly":"I can not fly");
    }

    @Override
    public int getSumDays() {
        return getAge()*365*4;
    }
}
