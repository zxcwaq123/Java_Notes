package lesson_SHK.code.object_oriented.day15.exer1_abstract;

public class Exer1_Abstract {
    public static void main(String[] args) {
        Manger m = new Manger();
        CommonEmployee c = new CommonEmployee();

        m.work();
        c.work();
    }
}

abstract class Employee{
    private String name;
    private int id;
    private double salary;

    public Employee(){

    }

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    abstract public void work();
}

class Manger extends Employee{
    private double bonus;

    public void work(){
        System.out.println("管理者工作");
    }
}

class CommonEmployee extends Employee{
    public void work(){
        System.out.println("普通员工工作");
    }
}