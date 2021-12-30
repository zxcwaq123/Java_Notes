package lesson_SHK.code.object_oriented.day8;

public class UtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{3,23,56,342,13,-67,-67,-67,-34,-5,234,62,46};
        int max = util.getMax(arr);
        int min = util.getMin(arr);
        int sum = util.getSun(arr);
        int avg = util.getAvg(arr);
        util.print(arr);
        util.reverse(arr);
        util.print(arr);
        util.sort(arr);
        util.print(arr);
        int index = util.getIndex(arr,342);
        System.out.println(max + "\t" +  min + "\t" + sum + "\t" + avg + "\t" + index);
    }
}
