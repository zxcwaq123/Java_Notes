package lesson_SHK.part1_basics.chap2_object_oriented.day12.polymorphismTest;

public class Man extends Person{

    boolean isSmoking;

    public void earnMoney(){
        System.out.println("挣钱");
    }

    @Override
    public void eat() {
        System.out.println("男吃");
    }

    @Override
    public void walk() {
        System.out.println("男走");
    }
}
