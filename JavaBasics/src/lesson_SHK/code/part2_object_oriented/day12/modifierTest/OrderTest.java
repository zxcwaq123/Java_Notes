package lesson_SHK.code.part2_object_oriented.day12.modifierTest;

public class OrderTest {
    public static void main (String[] args){
        Order order = new Order();

        order.orderDefault = 2;
        order.orderProtected = 3;
        order.orderPublic = 1;

        order.methodDefault();
        order.methodProtected();
        order.methodPublic();

        //同一个包中的其他类，不可以调用Order类中声明为private的属性或方法，如下：
        // order.orderPrivate = 4;
        // order.methodPrivate();
    }
}
