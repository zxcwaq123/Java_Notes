package lesson_SHK.code.object_oriented.day10_project02.bean;

/**
 * Customer类，用来封装客户信息
 * 1. 该类封装以下信息：
 * String name;
 * char gender;
 * int age;
 * String phone;
 * String email;
 * 2. 提供各种属性的get/set方法
 * 3. 提供所需的构造器（自行确定）
 */

public class Customer {
    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public Customer() {

    }

    public Customer(String name) {
        this.name = name;
    }

    public Customer(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Customer(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Customer(String name, char gender, int age, String phone) {
        this(name, gender, age);
        this.phone = phone;
    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this(name, gender, age, phone);
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return name + "\t\t" + gender + "\t\t" + age + "\t\t" + phone + "\t\t" + email;
    }
}
