/*
输出一个二维数组所有元素的总和
 */

package Lesson_SHK.Code.BasicGrammar.day_6;

public class ArrayExer_1 {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{3,5,8},{12,9},{7,0,6,4}};
        int sum = 0;
        for (int i =0; i < arr.length; i++){
            for (int j =0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        System.out.println("总和为" + sum);
    }
}
