package lesson_SHK.code.object_oriented.day12.polymorphismTest;
/*
面向对象特征之三：多态性

1. 理解：一个事物的多种形态
2. 何为多态性：
    子类对象的多态性：父类的引用指向子类的对象（子类的对象赋给父类的引用）
3. 多态的使用：虚拟方法调用
    有了对象的多态性后，编译时，只能调用父类中声明的方法，实际运行时，执行的时子类中重写的父类的方法。
    总结：编译看左，执行看右。

4. 多态性的使用前提：
    a. 类的继承关系
    b. 子类中要有方法的重写

5. 多态性的使用：见PolymorphismTest2.java
 */

public class PolymorphismTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Man man = new Man();
        man.eat();
        man.age = 25;
        man.earnMoney();

        //********************************************
        // 子类对象的多态性：父类的引用指向子类的对象
        Person p2 = new Man();
        Person p3 = new Woman();

        // 多态的使用：当调用子父类同名同参数的方法时，实际执行的时子类重写父类的方法---虚拟方法调用。
        p2.eat();

        //
        // p2.earMoney();
    }
}
