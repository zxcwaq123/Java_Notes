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
    1）二维数组的声明和初始化
    2）如何调用数组指定位置的元素
    3）如何获取数组的长度
    4）如何遍历数组
    5）数组元素的默认初始化值
    6）数组的内存解析
 */

package lesson_SHK.part1_basics.chap1_basic_grammar.day_5;

public class ArrayTest_2D {
    public static void main(String[] args) {
        // 1）二维数组的声明和初始化
        // int[] ids;        //一维声明
        int[] arr;
        //静态初始化：数组初始化和数组元素赋值同时进行
        //ids = new int[]{1001,1002,1003,1004};  //静态初始化
        int[][] arr1 = new int[][]{{1,2,3},{4,5},{6,7,8,9}};

        // 写法也正确
        int[] arr4 [] = new int[][]{{1,2,3},{4,5},{6,7,8,9}};
        int[] arr5 [] = {{1,2,3},{4,5},{6,7,8,9}};

        //动态初始化1：数组初始化和数组元素赋值分开进行
        String[][] arr2 = new String[3][2];    //
        //动态初始化1：数组初始化和数组元素赋值分开进行
        String[][] arr3 = new String[3][];    //

        // 2) 调用数组指定位置的元素
        System.out.println(arr1[0][1]); //2
        System.out.println(arr2[1][1]); //null

        arr3[1] = new String[4];
        System.out.println(arr3[1][0]); //null

        // 3) 获取数组的长度
        // 属性：length
        System.out.println(arr4.length); //3
        System.out.println(arr4[0].length); //3
        System.out.println(arr4[1].length); //2
        System.out.println(arr4[2].length); //4


        // 4) 遍历二维数组
        for(int i =0; i<arr4.length; i++){
            for (int j = 0; j < arr4[i].length; j++){
                System.out.print(arr4[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("--------------");

        // 5) 数组元素的默认初始化值
        /*
        一、初始化方式一：比如：int[][] arr_1 = new int[4][3];
                外层元素的初始化值为：地址值
                内层元素的初始化值为：与一维数组初始化情况相同

        二、初始化方式二：比如：int[][] arr_1 = new int[4][];
                外层元素的初始化值为：null
                内层元素的初始化值为：不能调用（空指针异常）

        三、一维数值的默认初始化值：
            >数组元素整型： ----->0
            >数组元素浮点型： ----->0.0
            >数组元素char型： ----->0或‘\u0000’，而非‘0’，即ASCII码为0的字符
            >数组元素布尔型： ----->false
            >数组元素引用数据类型： ----->null
         */

        int[][] arr_1 = new int[4][3];
        System.out.println(arr_1);       //[[I@58372a00
        System.out.println(arr_1[0]);    //[I@58372a00 (地址值)
        /*
                                         // [ --> 维度;
                                         // I --> 数组类型;
                                         // 58372a00 --> 地址值;
         */
        System.out.println(arr_1[0][0]); //0

        System.out.println("--------------");

        String[][] arr_2 = new String[4][3];
        System.out.println(arr_2[1]);    //地址值: [Ljava.lang.String;@6d03e736
        System.out.println(arr_2[1][1]); //null

        System.out.println("--------------");

        int[][] arr_3 = new int[4][];
        System.out.println(arr_3[1]);    //null
        System.out.println(arr_3[1][0]); //报错：空指针异常

        // 6) 数组的内存解析
        /*
        int[][] arr_1 = new int[4][];
        --> int[][] arr_1 // 在栈结构中存入arr_1
        --> new int[4][]; // 在堆空间中开辟长度为4的数组，并将数组的首地址值赋给栈结构中的arr_1

        arr[1]=new int[]{1,2,3} // 在堆空间中开辟长度为3的数组，并将数组的首地址值赋给栈堆空间中的arr_1[1]

        arr[2]=new int[4];      // 在堆空间中开辟长度为4的数组，并将数组的首地址值赋给栈堆空间中的arr_1[2]

        arr[2][1] = 30;         // 将30赋值给堆空间的arr[2][1]元素

        ****当程序运行至数组所在的方法之外时，数组arr_1弹出栈，堆空间中的内容被回收。


         */

    }
}
