/*
创建一个长度为6的int型数组，要求数组元素的值都在1-30之间，且是随机赋值。同时，要求元素的值各不相同。

***获取[a,b]的随机整数: (int)(Math.random() * (b - a + 1) + a)
 */
package Lesson_SHK.Code.BasicGrammar.day_6;

public class RandomNum {
    public static void main(String[] args) {
        int[] arr = new int[6];
        for (int i =0; i < arr.length;i++){
            arr[i] = (int) (Math.random() * 30 + 1);
            if (i != 0) {
                loop1:for (int j = 0; j < i; j++){
                    if (arr[i] == arr[j]){
                        arr[i] = (int) (Math.random() * 30 + 1);
                        continue loop1;
                    }
                }
            }
            System.out.print(arr[i] + "\t");
        }
    }
}
