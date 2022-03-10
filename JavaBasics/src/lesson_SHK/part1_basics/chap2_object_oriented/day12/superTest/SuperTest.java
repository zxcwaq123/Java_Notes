package lesson_SHK.part1_basics.chap2_object_oriented.day12.superTest;

/**
 * super关键字的使用测试
 * 1. super：父类的......
 * 2. super可以用类调用：属性、方法、构造器
 *
 * 3. super的使用
 *      3.1 可以在类的方法或构造器中。通过使用“super.属性”或“super.方法”的方式，显示地调用父类中声明的属性或方法。
 *          但，通常情况下可以省略“super.”
 *      3.2 当子类和父类中定义了同名的属性时，要想在子类中调用父类中声明的属性，则必须显式地使用“super.属性”，表明
 *          调用的是父类中声明的属性。
 *
 */
public class SuperTest {
    public static void main(String[] args) {

        Student student = new Student();
        student.show();
    }
}
