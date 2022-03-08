package lesson_SHK.code.part2_object_oriented.day8;

/*
考察参数的值传递：

1. 定义一个Circle类，包含一个double型的radius属性代表圆的半径，一个findArea(方法)返回圆的面积。
2. 定义一个类PassObject，在类中定义一个方法printAreas(),该方法定义如下：
    public void printAreas(Circle c, int time)
    在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
    例如，times为5，则输出半径1，2，3，4，5，以及对应的圆面积。
3. 在main方法中调用printAreas()方法，调用完毕后输出当前半径值。
 */
public class ValueTransferExer {
    public static void main(String[] args) {
        PassObject exer = new PassObject();

        //Circle c = new Circle();

        exer.printAreas(new Circle(), 5);
    }
}

class Circle{

    //圆的半径
    double radius;

    //圆的面积
    public double findArea(double r){
        return (Math.PI*Math.pow(r,2));
    }
}

class PassObject {
    public void printAreas(Circle c, int time) {
        System.out.println("Radius" + "\t" + "Area");
        for (int i = 1; i <= time; i++) {
            System.out.println(i + "\t\t" + c.findArea(i));
        }
    }
}