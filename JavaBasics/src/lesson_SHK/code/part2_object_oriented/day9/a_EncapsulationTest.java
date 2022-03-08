package lesson_SHK.code.part2_object_oriented.day9;
/*
面向对象的特征一：封装与隐藏
一、问题的引入
    当创建一个类的对象之后，可以通过“对象.属性”的方式，对对象的属性进行赋值。其中，赋值操作收到属性的数据类型和存储范围的制约。除此之外，没有其他制约条件。
    但是，在实际问题中，往往需要给属性赋值加入额外的限制条件。这个条件不能再属性声明时体现，只能通过方法进行限制条件的添加(例如setLegs()方法)。
    同时，需要避免用户再通过“对象.属性”的方式，对属性进行赋值。因此需要将属性声明为私有的(private)。
    -->此时，针对于属性，就体现了封装性。

二、封装性的体现
    a. 将类的属性私有化(private)，同时，提供公共的(public)方法来获取(getXxx)和设置(setXxx)此属性的值。
    b. 不对外暴露类的方法，将类的方法私有化(private)，只限类的内部使用。
    c. 单例模式(将构造器私有化)
    d. 如果不希望类在包外被调用，可以将类设置为缺省的。
    。。。

三、权限修饰符（可以体现封装性）
    1. Java规定的四种权限（从小到大）：private、缺省(什么都不写)、protected、public。
       访问权限
        private:   类内部
        缺省:       类内部、同一个包
        protected: 类内部、同一个包、不同包的子类
        public:    类内部、同一个包、不同包的子类、同一个工程
    2. 4种权限可以用来修饰类及类的内部结构：属性、方法、构造器、内部块
    3. 具体的：
        修饰类：        缺省(什么都不写)、public
        修饰类的内部结构：private、缺省(什么都不写)、protected、public

总结封装性：Java提供了4种权限来修饰类及类的内部结构，体现类及类的内部结构再被调用时可见性的大小。
 */
public class a_EncapsulationTest {
    public static void main(String[] args){

    }
}

class Animal{

    String name;
    private int age;
    private int legs;//private: 对legs进行封装

    //限制legs的个数,接口-->对属性的设置
    public void setLegs(int l){
        if(l >= 0 && l % 2 == 0){
            legs = l;
        }else{
            legs = 0;
        }
    }

    //属性设为private之后，需要提供调用属性的接口-->对属性的获取
    public int getLegs(){
        return legs;
    }

    //提供关于属性age的get和set方法
    public int gerAge(){
        return age;
    }
    public void setAge(int a){
        if (a >= 0){
            age = a;
        }else{
            age = 0;
        }
    }

    public void eat(){
        System.out.println("吃");
    }

    public void show(){
        System.out.println("Name = " + name + ", age = " + age + ", legs = " + legs);
    }
}