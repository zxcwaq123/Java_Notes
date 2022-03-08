/*
一、 数组的概述
1. 数组的理解：。。。

2. 数组相关的概念
>数组名
>元素
>索引，角标，下标
>数组的长度：元素的个数

3. 数组的特性。
1）数组是有序排列的。
2）数组属于引用数据类型的变量。
3）创建数组对象会在内存中开辟一整块连续的空间。
4）数组的长度一旦确定，就不能修改。

4. 一维/二维数组的使用
    1）一维数组的声明和初始化
    2）如何调用数组指定位置的元素
    3）如何获取数组的长度
    4）如何遍历数组
    5）数组元素的默认初始化值
    6）数组的内存解析
 */

package lesson_SHK.code.part1_basic_grammar.day_5;

public class ArrayTest_1D {
    public static void main(String[] args) {
        // 1）一维数组的声明和初始化
        int[] ids;        //声明
        //静态初始化：数组初始化和数组元素赋值同时进行
        ids = new int[]{1001,1002,1003,1004};  //静态初始化
        //动态初始化：数组初始化和数组元素赋值分开进行
        String[] names = new String[5];    //

        // 2) 调用数组指定位置的元素
        names[0] = "111";
        names[1] = "222";
        names[2] = "333";
        names[3] = "444";
        names[4] = "555 ";

        // 3) 获取数组的长度
        // 属性：length
        System.out.println(names.length);
        System.out.println(ids.length);

        // 4) 遍历数组
        for(int i =0; i<names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("--------------");

        // 5) 数组元素的默认初始化值
        /*
            >数组元素整型： ----->0
            >数组元素浮点型： ----->0.0
            >数组元素char型： ----->0或‘\u0000’，而非‘0’，即ASCII码为0的字符
            >数组元素布尔型： ----->false
            >数组元素引用数据类型： ----->null
         */

        int[] arr1 = new int[2];
        for(int i =0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("--------------");

        float[] arr2 = new float[2];
        for(int i =0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("--------------");

        char[] arr3 = new char[2];
        for(int i =0; i<arr3.length; i++){
            System.out.println(arr3[i]);
        }
        System.out.println("--------------");

        boolean[] arr4 = new boolean[2];
        for(int i =0; i<arr4.length; i++){
            System.out.println(arr4[i]);
        }
        System.out.println("--------------");

        String[] arr5 = new String[2];
        for(int i =0; i<arr5.length; i++){
            System.out.println(arr5[i]);
        }
        System.out.println("--------------");

        // 6) 数组的内存解析

    }
}
