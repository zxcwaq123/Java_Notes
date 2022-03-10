package lesson_SHK.part1_basics.chap2_object_oriented.day13.polymorphismTest2;

public class Test5_InstanceTest {
    public static void main(String[] args) {
        Test5_InstanceTest i = new Test5_InstanceTest();

        i.method(new Person());
        System.out.println("**************");
        i.method(new Student());
        System.out.println("**************");
        i.method(new Graduate());
    }

    public void method(Person p){

        // 虚拟方法调用
        System.out.println(p.getInfo());

        if (p instanceof Graduate){
            System.out.println("a graduated student");
        }

        if(p instanceof Student){
            System.out.println("a student");
        }

        if(p instanceof Person){
            System.out.println("a person");
        }
    }
}


class Person {
    protected String name = "person";
    protected int age = 50;
    public String getInfo(){
        return "Name: " + name + "\nage: " + age;
    }
}

class Student extends Person {
    protected String school = "pku";

    @Override
    public String getInfo() {
        return super.getInfo()  + "\nschool: " + school;
    }
}

class Graduate extends Student {
    public String major = "IT";

    @Override
    public String getInfo() {
        return super.getInfo() + "\nmajor: " + major;
    }
}