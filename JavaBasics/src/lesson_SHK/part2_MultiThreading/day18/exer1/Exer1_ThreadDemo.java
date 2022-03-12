package lesson_SHK.part2_MultiThreading.day18.exer1;

/**
 * @author YaguangChen
 * @description 创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 * @create 2022/3/11 星期五 16:36
 **/
public class Exer1_ThreadDemo {
    public static void main(String[] args) {
        // 方式一：常规步骤
        if(false){
            EvenThread e = new EvenThread();

            OddThread o = new OddThread();

            e.start();
            o.start();
        }

        // 方式二：创建Thread类的匿名子类
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if(i % 2 == 0)
                        System.out.println("偶数数：" + i);
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    if(i % 2 != 0)
                        System.out.println("奇数：" + i);
                }
            }
        }.start();
    }
}

class EvenThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0)
                System.out.println("偶数：" + i);
        }
    }
}

class OddThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0)
                System.out.println("奇数：" + i);
        }
    }
}