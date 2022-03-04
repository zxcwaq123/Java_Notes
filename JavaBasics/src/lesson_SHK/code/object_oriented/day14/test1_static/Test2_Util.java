package lesson_SHK.code.object_oriented.day14.test1_static;
/*
用static关键字，将ArrayUtil中的方法全部静态化。
则可以不用new对象，而直接调用类中的方法。
 */
public class Test2_Util {
    public static void main(String[] args) {
        // ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{3,23,56,342,13,-67,-67,-67,-34,-5,234,62,46};
        int max = ArrayUtil.getMax(arr);
        int min = ArrayUtil.getMin(arr);
        int sum = ArrayUtil.getSun(arr);
        int avg = ArrayUtil.getAvg(arr);
        ArrayUtil.print(arr);
        ArrayUtil.reverse(arr);
        ArrayUtil.print(arr);
        ArrayUtil.sort(arr);
        ArrayUtil.print(arr);
        int index = ArrayUtil.getIndex(arr,342);
        System.out.println(max + "\t" +  min + "\t" + sum + "\t" + avg + "\t" + index);
    }
}
