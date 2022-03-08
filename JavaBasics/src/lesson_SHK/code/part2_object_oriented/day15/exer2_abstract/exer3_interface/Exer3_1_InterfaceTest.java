package lesson_SHK.code.part2_object_oriented.day15.exer2_abstract.exer3_interface;

public class Exer3_1_InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(10);
        ComparableCircle c2 = new ComparableCircle(20);

        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(c1));
        System.out.println(c2.compareTo(c1));

    }
}

interface CompareObject{

    // 若返回值是0，代表相等；若为正数，代表当前对象大；若为负数，代表当前对象小。
    public int compareTo(Object o);
}

class Circle{

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(){

    }

    public ComparableCircle(double radius){
        super.setRadius(radius);
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;

//          方式一：
            if (this.getRadius() > c.getRadius())
                return 1;
            else if(this.getRadius() < c.getRadius())
                return -1;
            else
                return 0;

//          方式二：当属性声明为Double包装类型时，可以调用包装类的方法
//          return this.getRadius().compareTo(c.getRadius());
        }

        throw new RuntimeException("传入数据不匹配");
    }
}