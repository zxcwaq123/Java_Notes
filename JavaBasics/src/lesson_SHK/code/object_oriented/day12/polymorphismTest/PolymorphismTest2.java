package lesson_SHK.code.object_oriented.day12.polymorphismTest;

public class PolymorphismTest2 {
    public static void main(String[] args) {
        PolymorphismTest2 p1 = new PolymorphismTest2();
        p1.func(new Cat());
    }

    public void func(Animal animal){
        animal.eat();
        animal.shout();
    }
}

class Animal{
    public void eat(){
        System.out.println("动吃");
    }

    public void shout(){
        System.out.println("叫");
    }
}

class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("狗吃");
    }

    @Override
    public void shout() {
        System.out.println("汪汪");
    }
}

class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("猫吃");
    }

    @Override
    public void shout() {
        System.out.println("喵喵");
    }
}