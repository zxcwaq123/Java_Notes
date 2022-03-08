/*
输出100000以内所有的质数
质数（素数）：只能被1和它本身整除的自然数。
 */
package lesson_SHK.code.part1_basic_grammar.day_4;

public class PrimeNumTest_2 {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        int count = 0;

        for (int i=1;i<=100000;i++){      // 遍历100000以内的自然数
            int coef = 0;

            for (int j=2;j<=Math.sqrt(i);j++){    // 优化2：只计算2到i的正平方根（注意是<=） 1786ms --> 124ms
                if(i % j == 0){
                    coef ++;
                    break;            // 优化1：只对非质数的自然数有效 17184ms --> 1786ms
                }
            }
            if (coef == 0) {
                // System.out.println(i);
                count++;                     // 优化3：只输出质数个数，不每次都输出 124ms --> 14ms
            }
        }

        long end = System.currentTimeMillis();

        System.out.println("质数个数为" + count);
        System.out.println("花费的时间为：" + (end - start) + "ms");
    }
}
