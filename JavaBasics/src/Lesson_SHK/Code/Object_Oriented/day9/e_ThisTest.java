package Lesson_SHK.Code.Object_Oriented.day9;
/*
this关键字的使用
1. this可以用来修饰、调用：属性、方法、构造器

2. this修饰属性和方法
    this理解为：当前对象

    2.1 在类的方法中，我们可以使用“this.属性” 或 “this.方法”的方式，调用当前对象属性或方法。但是，通常情况下，都选择省略“this.”。
    特殊情况下，如果方法的形参和类的属性同名时，必须显示地使用“this.变量”，表明此变量时属性，而非形参。

    2.2 在类的构造器中，我们可以使用“this.属性” 或 “this.方法”的方式，调用当前对象属性或方法。但是，通常情况下，都选择省略“this.”。
    特殊情况下，如果构造器的形参和类的属性同名时，必须显示地使用“this.变量”，表明此变量时属性，而非形参。

3. this修饰、调用构造器
    3.1 在类的构造器中，可以显示的使用“this(形参列表)”来调用本类中指定的其他构造器。
    3.2 构造器中不能通过“this(形参列表)”来调用自己本身。
    3.3 如果一个类中有n个构造器，最多有n - 1个构造器中使用了“this(形参列表)”
    3.4 规定：“this(形参列表)”必须声明在当前构造器的首行
    3.5 构造器内部，最多只能声明一个“this(形参列表)”，用来调用其他的构造器。
 */
public class e_ThisTest {
}
