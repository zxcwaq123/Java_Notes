package lesson_SHK.part1_basics.chap2_object_oriented.day14.test2_singleton;
// 单例模式实现方式一：饿汉式
public class Test1_Singletone {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();

        System.out.println(bank1 == bank2);
    }
}

class Bank{
    // 1. 私有化类的构造器
    private Bank(){

    }

    // 2. 在类的内部创建类的静态的对象
    private static Bank instance = new Bank();

    // 3. 提供公共的静态的方法，返回类的对象
    public static Bank getInstance(){
        return instance; // 静态方法调用的属性也必须是静态的，因此2中声明为静态
    }
}
