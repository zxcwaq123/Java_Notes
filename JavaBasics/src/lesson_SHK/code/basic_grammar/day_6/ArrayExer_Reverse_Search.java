/*
算法考察：数组的复制、反转、查找（线性查找、二分法查找）

 */

package lesson_SHK.code.basic_grammar.day_6;

public class ArrayExer_Reverse_Search {
    public static void main(String[] args) {

        String[] arr = new String[]{"JJ", "DD", "GG", "MM", "AA", "BB"};

        //数组的复制（区别于数组变量的赋值：arr1 = arr）
        String[] arr1 = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }

        //数组的反转
        for (int i = 0; i < arr1.length / 2; i++) {
            String temp = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - i - 1] = temp;
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "\t");
        }

        System.out.println("\n--------------------");

        //查找
        //线性（顺序）查找
        String dest = "BB";

        Boolean noFind = true;

        for (int i = 0; i < arr.length; i++) {
            if (dest.equals(arr[i])) {
                System.out.println("找到了指定的元素，为第" + (i + 1) + "个");
                noFind = false;
                break;
            }
        }

        if (noFind) {
            System.out.println("没找到相应元素");
        }
        System.out.println("\n--------------------");


        //二分法查找
        //前提：所要查找的数组必须有序。
        int[] arr2 = new int[] {-78,-65,-34,-12,-9,3,9,15,23,34,47,53,62,76,89,96};

        int dest1 = 47;
        int head = 0; //初始首引索
        int end = arr2.length -1; //初始末引索
        boolean noFind1 = true;

        while(head <= end){
            int mid = (head + end) / 2;
            if (arr2[mid] == dest1) {
                System.out.println("找到了指定的元素，为第" + (mid + 1) + "个");
                noFind1 = false;
                break;
            }else if(dest1 > arr2[mid]){
                head = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        if(noFind1){
            System.out.println("没找到相应元素");
        }



    }
}
