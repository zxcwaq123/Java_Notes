package lesson_SHK.part1_basics.chap2_object_oriented.day13.test11_Wrapper;

import org.junit.Test;

public class WrapperTest {

    /*
    JDK 5.0新特性：自动装箱与拆箱
     */
    @Test
    public void test0(){

        //自动装箱：基本数据类型 ——> 包装类
        int num1 = 10;
        Integer int1 = num1;

        Boolean b2 = true;

        //自动拆箱：包装类 ——> 基本数据类型
        int num3 = int1;
    }

    //基本数据类型 ——> 包装类：调用包装类的构造器
    @Test
    public void test1(){

        int num1 = 10;
        //方法1：通过构造器
        Integer int1 = new Integer(num1);
        System.out.println(int1.toString());
        System.out.println(int1);

        //方法2：通过字符串参数
        Integer int2 = new Integer("123");
        System.out.println(int1.toString());

        // NumberFormatException
        //Integer int3 = new Integer("123ABC");
        //System.out.println(int1.toString());


        Float f1 = new Float(12.3f);
        Float f2 = new Float("12.3");
        System.out.println(f1);
        System.out.println(f2);


        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("TrUe");
        Boolean b3 = new Boolean("true123");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }

    //包装类 ——> 基本数据类型：调用包装类的xxxValue()
    @Test
    public void test2(){
        Integer int1 = new Integer(12);
        int i1 = int1.intValue();
        System.out.println(i1+3);


        Float f1 = new Float(12.3);
        float f2 = f1.floatValue();
        System.out.println(f2);
    }

    //基本数据类型、包装类 ——> String类型：调用String重载的valueOf(Xxx xxx)
    @Test
    public void test3(){

        int num1 = 10;
        //方式1：连接运算
        String str1 = num1 + "";
        //方式2：
        float f1 = 12.3f;
        String str2 = String.valueOf(f1); //"12.3"

        Double d1 = new Double(12.4);
        String str3 = String.valueOf(d1);
    }

    //String类型 ——> 基本数据类型、包装类：调用包装类中的parseXxx()
    @Test
    public void test4(){

        String str1 = "123";
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);

        String str2 = "true1";  // 只要不是true，就都是false
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println(b1);

    }
}
