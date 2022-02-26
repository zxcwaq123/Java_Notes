package lesson_SHK.code.object_oriented.day12.superTest;

import javax.lang.model.element.NestingKind;

public class Student extends Person{

    String major;
    int id = 1002;

    public  Student(){

    }

    public Student(String major){
        this.major = major;
    }

    public Student(String name, int age, String major){
        super(name,age);
        // 构造器内部，“this(形参列表)”或“this(形参列表)”，只能二选一
        this.major = major;
    }

    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    public void study(){
        System.out.println("学生学习");
    }

    public void show(){
        System.out.println("name = " + name + "; age = " + age);
        // 类的属性不会被重写/覆盖
        System.out.println("defaultId = " + id + "; thisId = " + this.id + "; superId = " + super.id);
    }
}
