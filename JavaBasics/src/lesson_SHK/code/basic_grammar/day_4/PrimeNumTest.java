/*
输出100以内所有的质数
质数（素数）：只能被1和它本身整除的自然数。
 */
package lesson_SHK.code.basic_grammar.day_4;

public class PrimeNumTest {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){      // 遍历100以内的自然数
            int coef = 0;
            for (int j=2;j<i;j++){    // j:除i
                if(i % j == 0){
                    coef ++;
                }
            }
            if (coef == 0)
            System.out.println(i);
        }
    }
}
