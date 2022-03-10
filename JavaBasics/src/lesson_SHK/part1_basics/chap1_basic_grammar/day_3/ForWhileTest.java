/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
 */

package lesson_SHK.part1_basics.chap1_basic_grammar.day_3;

import java.util.Scanner;

public class ForWhileTest{
    public static void main(String[] args) {
        System.out.println("请输入若干整数：");
        Scanner scan = new Scanner(System.in);
        int pNumSum = 0;
        int nNumSum = 0;
        int i = 0;
        do {
            i = scan.nextInt();
            if(i > 0){
                pNumSum++;
            }
            else if(i < 0){
                nNumSum++;
            }

        }while(i != 0);

        System.out.println("正数个数为：" + pNumSum);
        System.out.println("负数个数为：" + nNumSum);
    }
}