package Lesson_SHK.Code.Object_Oriented.day8;

public class ArrayUtil {

    // 求数组的最大值
    public int getMax(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    // 求数组的最小值
    public int getMin(int[] arr){
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
            }
        }
        return minValue;
    }

    // 求数组的总和
    public int getSun(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }

    // 求数组的平均值
    public int getAvg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }

    //反转数组
    public void reverse(int[] arr){
        for (int i = 0; i < arr.length/2; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - i -1];
            arr[arr.length - i -1] = temp;
        }
    }

    //复制数组
    public int[] copy(int[] arr){
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            copy[i] = arr[i];
        }
        return copy;
    }

    // 数组排序(冒泡)
    public void sort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if ( arr[j] > arr[j + 1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    //交换数组中指定两个位置元素的值——>值传递需要是引用数据类型
    public void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //遍历数组
    public void print(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    //查找指定元素
    public int getIndex(int[] arr, int dest){
        int head = 0;
        int end = arr.length -1;

        while(head <= end){
            int mid = (head + end)/2;
            if(arr[mid] == dest){
                return mid;
            }else if(arr[mid] < dest){
                head = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
