package lesson_SHK.part1_basics.chap2_object_oriented.day8;
/*
递归方法的使用

 */
public class RecursionTest {

    public static void main(String[] args) {

        // test1: 计算1-100之间所有自然数的和
        RecursionTest test = new RecursionTest();
        System.out.println(test.getSum1(100));
        System.out.println(test.getSum2(5));
        System.out.println(test.f(10));
        System.out.println(test.Fibonacci(10));

    }

    // test1: 计算1-n之间所有自然数的和
    public int getSum1(int n){
        if (n == 1){
            return 1;
        }else{
            return n + getSum1(n-1);
        }
    }

    // test2: 计算1-n之间所有自然数的乘积
    public int getSum2(int n){
        if (n == 1){
            return 1;
        }else{
            return n * getSum2(n-1);
        }
    }

    // test3: 已知有一个数列：f(0) = 1, f(1) = 4, f(n+2) = 2 * f(n+1) + f(n);
    //其中n是大于0的整数，求f(10)的值。
    public int f(int n){
        if (n == 0){
            return 1;
        }else if (n == 1){
            return 4;
        }else {
            return 2 * f(n-1) + f(n-2);
        }
    }

    // test4: 斐波那契数列
    // 输入一个数据n，计算斐波那契数列(Fibonacci)的第n个值
    // 1 1 2 3 5 8 13 21 34 55
    // 规律: 一个数等于前两个数之和
    public int Fibonacci(int n){
        if (n <= 2){
            return 1;
        }else{
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }
}
