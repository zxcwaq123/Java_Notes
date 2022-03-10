package lesson_SHK.part1_basics.chap2_object_oriented.day8;
/*
一、理解“万事万物皆对象”
    1. 在Java语言范畴中，将功能、结构等封装在类中，通过类的实例化，来调用具体的功能结构。
        >Scanner, String等
        >文件：File
        >网络资源：URL
    2. 涉及到Java语言与前端的Html、后端的数据库交互时，前后端的结构在Java层面交互时，都体现为类、对象。

二、内存解析的说明
1.引用类型的变量，只可能储存两类值：null 或者 地址值（包含变量类型）。

三、匿名对象的使用
1.理解：创建的对象，没有显示地赋给一个变量名。
2.特征：匿名对象只用一次。
3.使用：如下


 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        System.out.println(p);

        p.sendEmail();
        p.playGame();

        //匿名对象
        new Phone().sendEmail();
        new Phone().playGame();

        //匿名对象的使用
        PhoneMall mall = new PhoneMall();
        mall.show(new Phone());//使用匿名对象


    }
}

class PhoneMall{
    public void show(Phone phone){
        phone.sendEmail();
        phone.playGame();
    }
}

class Phone{
    double price;//价格

    public void sendEmail(){
        System.out.println("发送邮件");
    }

    public void playGame(){
        System.out.println("玩游戏");
    }

    public void price(){
        System.out.println("手机价格是：" + price);
    }
}