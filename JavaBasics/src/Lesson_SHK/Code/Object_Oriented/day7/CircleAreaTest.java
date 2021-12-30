package Lesson_SHK.Code.Object_Oriented.day7;

public class CircleAreaTest {
    public static void main(String[] args) {
        Circle cir1 = new Circle();
        cir1.radius = 5;
        System.out.println(cir1.CircleArea());
    }
}

class Circle{

    //属性
    double radius; //半径

    //求圆的面积
    public double CircleArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
}
