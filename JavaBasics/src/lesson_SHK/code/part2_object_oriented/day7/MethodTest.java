package lesson_SHK.code.part2_object_oriented.day7;
/*
类中方法的声明和使用

方法：描述类应该具有的功能
比如：Math类：sqrt()、random()、...
     Scanner类：nextXxx()、...
     Arrays类：sort()、binarySearch()、toString()、equals()、...

1. 举例
public void eat(){}
public void sleep(int hour){}
public String getName(){}
public String getNation(String nation){}

2. 方法的声明：权限修饰符 返回值类型 方法名(形参列表){
                        方法体
             }

3. 说明：
    3.1 关于权限修饰符：默认使用public(权限最大)
        Java规定的4种权限修饰符：private、public、缺省(不加修饰符、)、protected --->封装性

    3.2 返回值类型： 有返回值 vs 无返回值
        3.2.1 如果有返回值，则必须在声明时，指定返回值类型。同时，方法中，需要使用return关键字返回指定类型的变量或常量。
              如果没有返回值，则在声明时，使用void

        3.2.2 是否需要返回值
              根据实际要求进行选择。

    3.3 方法名：属于标识符，遵循标识符命名的规则和规范，“见名知意”。

    3.4 形参列表：方法可以声明0个，1个，或若干个形参。
        格式：数据类型1 形参1， 数据类型2 形参2，...

    3.5 方法体：方法功能的体现。

4. return关键字的使用：
    1. 适用范围：使用在方法体中。
    2. 作用：1）结束方法，类似于break；
            2）针对于有返回值类型的方法，使用“return 数据”方法返回所要的数据。
    3.注意点：return关键字后面不可以声明执行语句。

5. 方法的使用中，可以调用当前类的属性或方法（可以是自己(递归)，也可以是其他方法）。

 */
public class MethodTest {
}


class Customer{

    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    public void sleep(int hour){
        System.out.println("睡了" + hour + "小时");
    }

    public String getName(){
        return name;
    }

    public String getNation(String nation){
        String info = "我的国际是: " + nation;
        return info;
    }
}