/*
数组的复制

*使用简单数组
(1) 创建一个名为ArrayTest的类，在main()方法中声明array1和array2两个变量，他们是int[]类型的数组。
(2) 使用大括号{}，把array1初始化为8个素数：2, 3, 5, 7, 11, 13, 17, 19.
(3) 显示array1的内容
(4) 赋值array2变量等于array1，修改array2中的偶数银锁元素，使其等于引索值（如array[0]=0, array[2]=2)。打印出array1.

***思考：如果array2 = array1; 那么array1和array2是什么关系？
****两者地址值相同，都指向了堆空间中的同一个数组实体（类似于快捷方式）;

扩展：修改题目，实现array2对array1数组的复制

 */
package lesson_SHK.code.basic_grammar.day_6;

public class ArrayExer_Copy {
    public static void main(String[] args){
        int [] array1, array2;

        array1 = new int[]{2,3,5,7,11,13,17,19};

        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + "\t");
        }
        System.out.println();

        // 赋值array2变量等于array1:数组赋值
        array2 = new int[array1.length];
        for(int i = 0; i < array1.length; i++){
            array2[i] = array1[i];
        }

        for(int i =1; i < array2.length; i+=2){
            array2[i] = i;
        }

        for(int i = 0; i < array1.length; i++){
            System.out.print(array2[i] + "\t");
        }

        for(int i = 0; i < array1.length; i++){
            System.out.print(array1[i] + "\t");
        }


    }
}
