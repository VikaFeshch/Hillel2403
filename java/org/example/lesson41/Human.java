package org.example.lesson41;

import org.example.Lesson4.ExamplE;

public class Human {
    private String name;
    private int age;
    private boolean alive;
    private String sex;

    public void setAge(int age) {
        if(age>=18&&age<=100) {
            this.age = age;
        }else {
            this.age=18;
        }
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAlive() {
        return alive;
    }

    public String getSex() {
        return sex;
    }

    public Human(String name, int age, String sex) {
        this.name = name;
        setAge(age);
        this.sex = sex;
        this.alive = true;
    }

    public Human(String name, int age, String sex, boolean alive) {
        this.name = name;
        setAge(age);
        this.alive = alive;
        this.sex = sex;
    }

    public Human() {
        this.name="John";
        setAge(age);
        this.sex="non undefined";
        this.alive=true;

    }

    public void printInfo() {
        System.out.println("Name = " + this.name + "\nAge = " + this.age + "\nsex = " + this.sex+"\nIslive = "+alive);
    }
}
