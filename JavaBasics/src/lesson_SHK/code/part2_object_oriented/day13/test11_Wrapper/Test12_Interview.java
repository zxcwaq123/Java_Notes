package lesson_SHK.code.part2_object_oriented.day13.test11_Wrapper;

import org.junit.Test;

/*
关于包装类的面试题：

 */
public class Test12_Interview {

    @Test
    public void Test1(){
        // 题一：下面两组代码输出是否一致？各是什么
        Object o1 = true ? new Integer(1) : new Double(2.0); // 三元运算符，要求前后类型统一，因此会自动类型提升
        System.out.println(o1);

        Object o2;
        if(true)
            o2 = new Integer(1);
        else
            o2 = new Double(2.0);
        System.out.println(o2);
    }

    @Test
    public void Test2(){
        //题二：
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);

        /*
        Integer内部定义了IntegerCache结构，IntegerCache中定义了Integer[],
        保存了从-128~127范围的整数。如果我们使用自动装箱的方式，给Integer复制的范围在
        -128~127范围内时，可以直接使用数组中的元素，不用再去new。
         */

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n); // -128 — 127在Integer中已经缓存

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);
    }

}
