package lesson_SHK.code.part2_object_oriented.day12.modifierTest2;

import lesson_SHK.code.part2_object_oriented.day12.modifierTest.Order;

public class SubOrder extends Order {
    public void method(){
        orderProtected = 1;
        orderPublic = 2;

        methodProtected();
        methodPublic();

        //在不同包的子类中，不能调用Order类中声明为private和缺省的属性和方法

        // orderDefault = 3;
        // orderPrivate = 4;
    }
}
