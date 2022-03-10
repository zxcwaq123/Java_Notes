package lesson_SHK.part1_basics.chap2_object_oriented.day8;
/*
关于变量的赋值：

    如果变量是基本数据类型：此时赋值的是变量所保存的数据值。
    如果变量是引用数据类型，此时赋值的是变量所保存的地址值。
 */
public class ValueTransferTest{
    public static void main(String[] args){
        System.out.println("*********基本数据类型*************");
        int m = 10;
        int n = m;
        System.out.println("m = " + m + "\t" + "n = " + n);
        m = 20;
        System.out.println("m = " + m + "\t" + "n = " + n);


        System.out.println("*********引用数据类型（对象）*************");
        Order o1 = new Order();
        o1.orderId = 1001;
        Order o2 = o1; // 赋值以后，两者地址值相同，都指向堆空间中同一个对象实体。
        System.out.println("o1.orderId = " + o1.orderId + "\t"  + "o2.orderId = " + o2.orderId);

        o2.orderId = 1002;
        System.out.println("o1.orderId = " + o1.orderId + "\t"  + "o2.orderId = " + o2.orderId);




    }
}

class Order{
    int orderId;
}