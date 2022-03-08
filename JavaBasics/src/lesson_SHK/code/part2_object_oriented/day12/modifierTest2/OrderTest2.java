package lesson_SHK.code.part2_object_oriented.day12.modifierTest2;

import lesson_SHK.code.part2_object_oriented.day12.modifierTest.Order;

public class OrderTest2 {
    public static void main (String[] args){
        Order order = new Order();

        order.orderPublic = 1;

        order.methodPublic();

        //不同包下的普通类（非子类），只能调用声明为public权限的方法和属性，如下：
        //order.orderDefault = 2;
        //order.orderProtected = 3;
    }
}
