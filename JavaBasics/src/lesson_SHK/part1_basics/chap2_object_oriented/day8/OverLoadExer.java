package lesson_SHK.part1_basics.chap2_object_oriented.day8;
/*
1. 编写程序，定义三个重载方法并调用。方法名为mOL。
    三个方法分别接收一个int参数、两个int参数、一个字符串参数。分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。
    在主类的main()方法中分别用参数区别调用三个方法。

2. 定义三个重载方法max()，第一个方法求两个int值中的最大值，
                      第二个方法求两个double值中的最大值，
                      第三个求三个double中的最大值。
                      并分别调用三个方法。
 */
public class OverLoadExer {

    public static void main(String[] args){
        OverLoadExer test1 = new OverLoadExer();

        //test mOL
        System.out.println(test1.mOL(8));
        System.out.println(test1.mOL(6,92));
        String i = "edgnb";
        test1.mOL(i);

        //test max
        System.out.println(test1.max(2,66));
        System.out.println(test1.max(5.34,5.33));
        System.out.println(test1.max(1.22,1.89,2.3));


    }

    public int mOL(int num){
        num *= num;
        return num;
    }

    public int mOL(int num1, int num2){
        num1 *= num2;
        return num1;
    }

    public void mOL(String s){
        System.out.println(s);
    }

    public int max(int i, int j){
        i = Math.max(i,j);
        return i;
    }

    public double max(double i, double j){
        i = Math.max(i,j);
        return i;
    }

    public double max(double i, double j, double k){
        i = Math.max(i,j);
        i = Math.max(i,k);
        return i;
    }
}
