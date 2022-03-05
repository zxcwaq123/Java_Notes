package lesson_SHK.code.object_oriented.day14.test3_codeBlock;

public class Test1_CodeBlock {
}

class Person{
    private String name;
    private int age;
    private static String nation;

    public Person(){

    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //代码块
    {

    }

    public void eat(){
        System.out.println("吃");
    }

    public String toString(){
        return "Person [name = " + name + ", age = " + age + "]";
    }
}