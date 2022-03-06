package lesson_SHK.code.object_oriented.day15.test2_interface;

public class Test1_Interface {
}

interface Flyable{

    // 全局常量
    public static final int Max_SPEED = 7900; // 第一宇宙速度
    int MIN_SPEED = 1; // 省略了 public static final

    // 抽象方法
    public abstract void fly();
    void stop(); //省略了public abstract
}

interface Attackable{
    public abstract void attack();
}

// 实现类一：重写所有抽象方法，可以实例化
class plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("飞机飞");
    }

    @Override
    public void stop() {
        System.out.println("飞机停");
    }
}

// 实现类二: 没有重写接口中所有的抽象方法，仍为抽象类，不能实例化
abstract class Kite implements Flyable{
    @Override
    public void fly() {

    }
}

// 类实现多个接口
class Bullet implements Flyable, Attackable{
    @Override
    public void attack() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void stop() {

    }
}

// 接口的多继承性
interface AA{}

interface BB{}

interface CC extends AA, BB{}