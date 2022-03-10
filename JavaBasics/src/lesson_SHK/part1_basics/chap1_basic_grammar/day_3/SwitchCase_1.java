/*
使用switch把小写类型的char型转为大写，只转换a, b, c, d, e, 其他则输出“other”
 */


package lesson_SHK.part1_basics.chap1_basic_grammar.day_3;

import java.util.Scanner;

public class SwitchCase_1 {
    public static void main(String[] args) {
        System.out.print("请输入您的字母：");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char l = word.charAt(0);

        switch (l) {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
                break;
        }
    }
}
