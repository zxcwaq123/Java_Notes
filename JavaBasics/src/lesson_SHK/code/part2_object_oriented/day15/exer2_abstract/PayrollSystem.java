package lesson_SHK.code.part2_object_oriented.day15.exer2_abstract;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {

        Employee[] ep = new Employee[10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < ep.length; i++){
            System.out.print("请输入第" + (i + 1) + "位员工的姓名：");
            String name = scan.next();
            System.out.print("请输入第" + (i + 1) + "位员工的生日（年 月 日）：");
            int year = scan.nextInt();
            int month = scan.nextInt();
            int day = scan.nextInt();
            System.out.print("该员工是否为正式员工（True：是；False：否，是小时工）");
            Boolean isFlag = scan.nextBoolean();
            if(isFlag){
                System.out.print("请输入员工月薪：");
                double monthlySalary = scan.nextDouble();
                ep[i] = new SalariedEmployee(name, new MyDate(year, month, day), monthlySalary);
            }else{
                System.out.print("请输入员工时薪：");
                double wage = scan.nextDouble();
                System.out.print("请输入工作小时数：");
                double hour = scan.nextDouble();
                ep[i] = new HourlyEmployee(name, new MyDate(year, month, day), wage, hour);
            }
            if(Employee.getTotal() != 10){
                System.out.print("\n是否继续输入下一员工信息（Y：是；N：否，退出）");
                if(scan.next().equals("N"))
                    break;
            }else
                break;

        }

        System.out.println("\n******************\n遍历员工：");
        for (int i = 0; i < Employee.getTotal(); i++) {
            System.out.println(ep[i].toString());
        }

        System.out.print("\n******************\n请输入月份：");
        int month = scan.nextInt();
        for (int i = 0; i < Employee.getTotal(); i++){
            if(ep[i].getMonth() == month){
                System.out.println(ep[i].toString());
                System.out.println("工资为：" + ep[i].earnings());
            }
        }
    }
}

abstract class Employee{
    private String name;
    private int number;
    private MyDate birthday;
    private static int nCount = 1001;
    private static int total = 0;


    public Employee(){
        this.number = nCount++;
    }

    public Employee(String name, MyDate birthday){
        this();
        this.name = name;
        this.birthday = birthday;
    }

    abstract double earnings();

    @Override
    public String toString() {
        return "name: " + name +
                ", number: " + number +
                ", birthday: " + birthday.toString();
    }

    public static void setTotal(int total) {
        Employee.total = total;
    }

    public static int getTotal() {
        return total;
    }

    public int getMonth(){
        return birthday.getMonth();
    }
}


class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee(){
        setTotal(getTotal() + 1);
    }

    public SalariedEmployee(String name, MyDate birthday, double monthlySalary){
        super(name, birthday);
        setTotal(getTotal() + 1);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double earnings() {
        return monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee[" + super.toString() + "]";
    }
}


class HourlyEmployee extends Employee{
    private double wage;
    private double hour;

    public HourlyEmployee(){
        setTotal(getTotal() + 1);
    }

    public HourlyEmployee(String name, MyDate birthday, double wage, double hour){
        super(name, birthday);
        setTotal(getTotal() + 1);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee[" + super.toString() + "]";
    }
}


class MyDate{
    private int year;
    private int month;
    private int day;

    public MyDate(){

    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    @Override
    public String toString() {
        return year + "年" + month + "月" + day + "日";
    }
}