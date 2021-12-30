package Lesson_SHK.Code.Object_Oriented.day7;
/*
一、设计类，其实就是设计类的成员

    属性 = 成员变量 = field = 域、字段
    方法 = 成员方法 = 函数 = method

    创建类的对象 = 类的实例化 = 实例化类

二、类和对象的使用（面向对象思想的实现）
    1.创建类，设计类的成员
    2.创建类的对象
    3.通过”对象.属性“或”对象.方法“调用对象的结构

三、如果创建了一个类的多个对象，则内阁对象都独立地拥有一套类的属性（非static）。
    即，如果修改一个对象的属性a，不影响另一个对象的属性a。

四、对象的内存解析

 */

//测试类
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();

        //调用对象的结构：属性、方法
        //调用属性："对象.属性"
        p1.name = "Tom";
        p1.age = 20;
        System.out.println(p1.name + "\t" + p1.age);

        //调用方法：”对象.方法“
        p1.eat();
        p1.spake("Chinese");
    }
}


class Person{

    //属性
    String name;
    int age;
    String gender;

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void spake(String language){
        System.out.println("他使用的是" + language);
    }
}