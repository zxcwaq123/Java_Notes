package lesson_SHK.code.part1_basic_grammar.day_6;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args){
        //1. boolean: equals(int[] a, int[] b); 判断两个数组是否相等。
        int[] arr1 = new int[] {1,2,3,4};
        int[] arr2 = new int[] {1,3,2,4};
        boolean isEquals = Arrays.equals(arr1,arr2);
        System.out.println(isEquals);

        //2. String: toString(int[] a); 输出数组信息（遍历）
        System.out.println(Arrays.toString(arr2));

        //3. void: fill(int[] a, int val); 将指定的值填充到（替换为）指定的值
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //4. void: sort(int[] a); 对数组进行排序
        int [] arr3 = new int[]{23,56,2,27,-8,-587,-546,-46,34,754,74,-6,8,-25,-57,-23,132};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        //5. int: binarySearch(int[] a, int key); 二分查找,返回下标（负数则为没找到）
        int index = Arrays.binarySearch(arr3,23);
        System.out.println(index);
    }
}
