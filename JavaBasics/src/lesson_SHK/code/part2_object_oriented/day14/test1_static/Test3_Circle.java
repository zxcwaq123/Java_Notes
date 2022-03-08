package lesson_SHK.code.part2_object_oriented.day14.test1_static;

public class Test3_Circle {
    public static void main(String[] args) {

        Circle c1 = new Circle();


    }
}

class Circle {

    private double radius;
    private int id;

    private static int total;
    private static int init = 1001; //多个对象共享，并可以使id依次增加

    public Circle(){
        id = init++;
        total++;
    }

    public Circle(double radius){
        this();
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public static int getTotal() {
        return total;
    }

    public int getId() {
        return id;
    }

    public static int getInit() {
        return init;
    }
}