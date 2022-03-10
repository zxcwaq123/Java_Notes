/*
分支结构之二: switch-case

1. 格式
switch(){
case 常量1:
    执行语句1;
    break;

case 常量2:
    执行语句2;
    break;

...

default:
    执行语句n;
    break;

2. 说明
1）一旦case匹配成功，则执行其后所有语句，直到遇到break关键字，或者执行到switch-case语句结束为止。

2）switch结构中的表达式，只能是如下的6种数据类型之一: byte, short, int, 枚举类型(), char, String.

3) case后只能接常量，不能接范围。

4) break是可选选项，非必须选项；可以不写break，合理利用switch-case的穿透性质。
*/
package lesson_SHK.part1_basics.chap1_basic_grammar.day_3;

import java.util.Scanner;

public class SwitchCaseTest_1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        switch (num1) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Other");
                break;
        }
    }

}
