package lesson_SHK.code.object_oriented.day14.test2_singleton;
// 单例模式实现方式一：懒汉式
public class Test2_Singleton {
    public static void main(String[] args) {
        Order o1 = Order.getInstance();
        Order o2 = Order.getInstance();

        System.out.println(o1 == o2);
    }
}

class Order{

    //1. 私有化类的构造器
    private Order(){
    }

    //2. 声明当前类的对象，没有初始化
    private static Order instance = null;

    //3. 提供公共的静态的方法，返回类的对象
    public static Order getInstance(){
        if(instance == null)
        instance = new Order();

        return instance;
    }
}