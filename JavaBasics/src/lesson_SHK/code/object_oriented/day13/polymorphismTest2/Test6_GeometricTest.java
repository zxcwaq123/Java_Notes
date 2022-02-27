package lesson_SHK.code.object_oriented.day13.polymorphismTest2;

public class Test6_GeometricTest {

    public static void main(String[] args) {
        Test6_GeometricTest t = new Test6_GeometricTest();

        t.displayGeometricObject(new Circle(45,"black",50));

        t.displayGeometricObject(new MyRectangle(22,25,"black",50));

        System.out.println(t.equalsArea(new Circle(45,"black",50),new MyRectangle(22,25,"black",50)));

        System.out.println("*******************************");

        t.displayGeometricObject(new MyRectangle(24,9,"black",50));

        t.displayGeometricObject(new MyRectangle(3,72,"black",50));

        System.out.println(t.equalsArea(new MyRectangle(24,9,"black",50),new MyRectangle(3,72,"black",50)));

    }

    public boolean equalsArea(GeometricObject g1, GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g){
        System.out.println(g.findArea());
    }
}

class GeometricObject{
    protected String color;
    protected double weight;

    protected GeometricObject(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius, String color, double weight){
        super(color,weight);
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * Math.pow(radius,2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class MyRectangle extends GeometricObject{
    private double width;
    private double height;

    public MyRectangle(double width, double height, String color, double weight){
        super(color,weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return width * height;
    }
}