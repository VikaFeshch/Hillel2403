package org.example.Lesson4;

public class lesson4 {
    public static void main(String[] args) {
  /*      ExamplE.name="Vika";
        System.out.println(ExamplE.name);
        ExamplE.name="Veronika";
        System.out.println(ExamplE.name);
*/
        ExamplE human=new ExamplE();
        human.name="Vika";
        human.age=45;
        human.sex="female";
        ExamplE human1=new ExamplE();
        human1.name="Veronika";
        human1.age=25;
        human1.sex="female";
        human.printInfo();

        System.out.println(human.name);
        System.out.println(human1.name);
    }
}
