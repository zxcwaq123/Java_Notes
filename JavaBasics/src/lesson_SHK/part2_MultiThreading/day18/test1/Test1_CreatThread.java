package lesson_SHK.part2_MultiThreading.day18.test1;

/**
 * @author YaguangChen
 * @description 使用Thread遍历100以内所有的偶数
 * @create 2022/3/11 星期五 16:01
 **/
public class Test1_CreatThread {
    public static void main(String[] args) {

        // 3. 创建Thread类的子类的对象
        MyThread t1 = new MyThread();

        // 4. 通过此对象调用start()方法，其作用是：
        //   * 启动当前线程
        //   * 调用当前线程的run()方法
        t1.start();

    }
}

// 1. 创建继承于Thread类的子类
class MyThread extends Thread{

    // 2. 重写Thread类的run() ——> 将此线程要执行的操作声明在run()中

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if(i % 2 == 0)
                System.out.print(i + "\t");
        }
    }
}