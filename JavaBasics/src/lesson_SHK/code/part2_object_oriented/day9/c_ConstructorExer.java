package lesson_SHK.code.part2_object_oriented.day9;
/*
编写类：TriAngle类，声明私有的底边长base和高height,同时声明公共方法访问私有变量。
此外，提供类必要的构造器。
 */
public class c_ConstructorExer {
    public static void main(String[] args) {
        TriAngle tri = new TriAngle(3,5);
        System.out.println("base = " + tri.getBase() + "\t" + "height = " + tri.getHeight());

        tri.setBase(6);
        tri.setHeight(10);
        System.out.println("base = " + tri.getBase() + "\t" + "height = " + tri.getHeight());

    }
}

class TriAngle{

    private double base;   //底边长
    private double height; //高

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public TriAngle(double b, double h){
        base = b;
        height = h;
    }
}
