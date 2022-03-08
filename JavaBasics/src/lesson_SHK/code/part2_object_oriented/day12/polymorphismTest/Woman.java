package lesson_SHK.code.part2_object_oriented.day12.polymorphismTest;

public class Woman extends Person{

    boolean isBeauty;

    public void shopping(){
        System.out.println("购物");
    }

    @Override
    public void eat() {
        System.out.println("女吃");
    }

    @Override
    public void walk() {
        System.out.println("女走");
    }
}
