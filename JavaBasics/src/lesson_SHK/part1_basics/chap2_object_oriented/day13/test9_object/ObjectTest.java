package lesson_SHK.part1_basics.chap2_object_oriented.day13.test9_object;

public class ObjectTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(5,"black",0.5);
        Circle c2 = new Circle(5,"black",0.5);
        Circle c3 = new Circle(10,"black",0.5);

        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.toString());
        System.out.println(c3.toString());
    }
}

class GeometricObject{
    protected String color;
    protected double weight;

    protected GeometricObject(){
        color = "white";
        weight = 1.0;
    }

    protected GeometricObject(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Circle extends GeometricObject{
    private double radius;

    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, double weight){
        super(color, weight);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double findArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if (obj instanceof Circle){
            Circle cir = (Circle) obj;
            return this.radius == cir.radius;
        }

        return false;
    }

    public String toString(){
        return "Circle [radius=" + radius + "]";
    }
}