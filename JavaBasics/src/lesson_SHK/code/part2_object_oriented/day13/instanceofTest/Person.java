package lesson_SHK.code.part2_object_oriented.day13.instanceofTest;

public class Person {
    String name;
    int age;
    int id = 1001;

    public Person(){

    }

    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age){
        // this.name = name;
        this(name);
        this.age = age;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    public void walk(){
        System.out.println("走路");
    }
}
