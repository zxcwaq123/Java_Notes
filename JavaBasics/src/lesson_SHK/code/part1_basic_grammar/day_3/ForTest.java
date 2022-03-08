package lesson_SHK.code.part1_basic_grammar.day_3;
/*
For循环结构的使用
一、循环结构的4个要素
    1）初始化条件
    2）循环条件 ————>Boolean类型
    3）循环体
    4）迭代条件

二、for循环的结构

for(1;2;4){
    3
}

执行过程：1-->2-->3-->4
 */

/*
输入两个正整数m和n，求其最大公约数和最小公倍数。
比如：12和20的最大公约数是4，最小公倍数是60。
说明：break关键字的使用。
 */

import java.util.Scanner;

public class ForTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入第一个正整数：");
        int m = scan.nextInt();
        System.out.print("请输入第二个正整数：");
        int n = scan.nextInt();

        //求最大公约数
        //获取两个数的最小值
        int min = (m <= n) ? m : n;
        for(int i=min; i>=1; i--){
            if(m % i == 0 && n % i == 0) {
                System.out.println("两数最小公倍数为：" + i);
                break;
            }
        }

        //求两个数的最大公约数
        int max = (m >= n) ? m : n;
        for(int i = m; i <= m*n;i++) {
            if(i % m == 0 && i % n == 0) {
                System.out.println("两数最大公约数为：" + i);
                break;
            }
        }

    }
}
