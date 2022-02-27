package lesson_SHK.code.object_oriented.day13.instanceofTest;
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

/*

 */

public class PolymorphismTest {
    public static void main(String[] args) {

        // Day 12 内容

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

        // 不能调用子类所特有的方法、属性，因为编译时，p2时Person类型
        /* 有了对象的多态性以后，内存中实际上已经加载了子类特有的属性和方法，但是由于变量声明为父类类型，
            导致编译时,只能调用父类中声明的属性和方法。子类特有的属性和方法不能调用。
        */
        // p2.earMoney();



        // Day13 新内容

        // 如何才能调用子类特有的属性和方法？
        // 向下转型--->使用强制类型转换符
        Man m1 = (Man)p2;
        m1.earnMoney();

        //使用强转时，可能出现ClassCastException的异常。
        // Woman w1 = (Woman)p2;

        // instanceof关键字的使用
        /*
        a instanceof A: 判断对象a是否是类A的实例。如果是，返回true；如果不是，返回false。

        使用情境：为了避免在向下转型时出现ClassCastException的异常，我们在向下转型之前，先进行instanceof的判断，返回true，就向下转型。
                返回false，就中止向下转型。
         */

        if(p2 instanceof Woman){
            Woman w1 = (Woman)p2;
        }

        if(p2 instanceof Man){
            Man m2 = (Man)p2;
            m2.earnMoney();
            m2.eat();
        }




    }
}
