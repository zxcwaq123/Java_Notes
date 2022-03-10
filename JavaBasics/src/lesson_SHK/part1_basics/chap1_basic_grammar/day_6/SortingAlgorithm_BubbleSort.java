/*
***数组的冒泡排序
每次比较两个数，将最大的后移，每次找出一个最大的，每次的比较次数也减少1；
* 循环arr.length-1次，即可完成排序。
 */
package lesson_SHK.part1_basics.chap1_basic_grammar.day_6;

public class SortingAlgorithm_BubbleSort {
    public static void main(String[] args) {

        int [] arr = new int[]{23,56,2,27,-8,-587,-546,-46,34,754,74,-6,8,-25,-57,-23,132};

        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr [j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
