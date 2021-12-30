/*
输出10行杨辉三角：
每行首尾都是一，其他数为其上一行同列的数，加上上一行同列之前的数之和。
 */
package Lesson_SHK.Code.BasicGrammar.day_6;

public class ArrayExer_2 {
    public static void main(String[] args) {
        int[][] yhTriangle = new int[10][];
        for (int i=0; i<yhTriangle.length; i++){
            yhTriangle[i] = new int[i+1];
            for (int j = 0; j<yhTriangle[i].length; j++){
                if (j == 0 || j == i){
                    yhTriangle[i][j] = 1;
                }else{
                    yhTriangle[i][j] = yhTriangle[i-1][j] + yhTriangle[i-1][j-1];
                }
                System.out.print(yhTriangle[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
