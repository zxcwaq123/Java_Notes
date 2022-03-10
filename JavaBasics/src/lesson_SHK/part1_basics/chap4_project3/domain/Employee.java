package lesson_SHK.part1_basics.chap4_project3.domain;

import lesson_SHK.part1_basics.chap4_project3.service.Equipment;
import lesson_SHK.part1_basics.chap4_project3.service.Status;

public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(){

    }

    public Employee(int id, String name, int age, double salary){
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary =salary;
    }

    public String getInfo(){
        return id + "\t" + name + "\t" + age + "\t" + salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}