/*
从键盘输入学生成绩，找出最高分，并相互出学生成绩等级。
成绩>=最高分-10 等级为‘A’
成绩>=最高分-20 等级为‘B’
成绩>=最高分-30 等级为‘C’
成绩>=最高分-40 等级为‘D’
提示：先读取学生人数，然后创建数组，储存成绩。
 */

package lesson_SHK.code.part1_basic_grammar.day_5;

import java.util.Scanner;

public class ArrayTest_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 读取学生人数
        System.out.print("请输入学生人数：");
        int stuNum = scan.nextInt();

        // 创建数组, 动态初始化
        int[] score = new int[stuNum];
        char[] grade = new char[stuNum];

        // 读取学生成绩
        int maxScores = 0;
        System.out.println("请依次输入" + stuNum +"个学生成绩：");
        for (int i = 0; i < stuNum; i++){
            score[i] = scan.nextInt();
            // 找出最高分
            if (i>0){
                maxScores = Math.max(score[i], score[i - 1]);
            }
        }

        // 判断并储存学生成绩等级, 输出最高分和学生成绩等级
        System.out.println("最高分是：" + maxScores);
        for(int i = 0; i < stuNum; i++){

            // 判断并储存学生成绩等级
            if(maxScores-score[i] <= 10){
                grade[i] = 'A';
            } else if (maxScores-score[i] <= 20){
                grade[i] = 'B';
            } else if (maxScores-score[i] <= 30){
                grade[i] = 'C';
            } else {
                grade[i] = 'D';
            }

            // 输出最高分和学生成绩等级
            System.out.println("学生" + i + "的成绩是" + score[i] +", 等级是" + grade[i]);
        }

    }
}
