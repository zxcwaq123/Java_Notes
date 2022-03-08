package lesson_SHK.code.part1_basic_grammar.day_6;
/*
数组中的常见异常：
1. 数组角标越界异常: ArrayIndexOutOfBoundsException

2. 空指针异常：NullPointerException


 */
public class ArrayException {
    public static void main(String[] args) {
        int[] arr2 = new int[] {-78,-65,-34,-12,-9,3,9,15,23,34,47,53,62,76,89,96};
        for(int i = 0; i < arr2.length -1; i++){
            for (int j = 0; j < arr2.length -1 -i; j++){
                if(arr2[j] > arr2[j+1]){
                    int temp = arr2[j];
                    arr2[j+1] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
    }
}
