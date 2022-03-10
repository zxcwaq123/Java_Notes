package lesson_SHK.part1_basics.chap2_object_oriented.day13.exer10_Wrapper;

import java.util.Scanner;
import java.util.Vector;

/*
利用Vector代替数组处理：从键盘读入学生成绩（以复数代表输入结束），找出最高分，并输出学生成绩等级。
创建Vector对象：Vector v = new Vector();
给向量添加元素：v.addElement(Object obj); // obj必须是对象
取出向量中的元素：Object obj = v.elementAt(0);
    第一个元素的下标是0，返回值是Object类型。
计算向量的长度：v.size();
判断等级：与最高分相差10分内：A
                  20分内：B
                  30分内：C
                  其他：D
 */
public class WrapperExer {
    public static void main(String[] args) {
        Vector v = new Vector();
        Scanner s = new Scanner(System.in);
        int max = 0;

        do {
            System.out.print("请输入学生成绩（结束请输入负数）：");
            Integer g = s.nextInt(); // 自动装箱
            if (g > max)
                max =g;
            if (g >=0)
                v.addElement(g);
            else
                break;
        }while (true);
        System.out.println("***********");
        System.out.println();

        int n = v.size();
        System.out.println("学生人数为：" + n);
        System.out.println("***********");
        System.out.println();
        //列出学生成绩
        for(int i = 0; i < n; i++){
            Integer g = (Integer) v.elementAt(i);
            System.out.print("学生" + (i+1) + "成绩：" + g + ", 等级：");
            if(max - g <= 10)
                System.out.println("A");
            else if(max - g <= 20)
                System.out.println("B");
            else if(max - g <= 30)
                System.out.println("C");
            else
                System.out.println("D");
        }
    }
}
