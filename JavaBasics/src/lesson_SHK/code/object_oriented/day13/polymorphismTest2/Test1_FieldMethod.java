package lesson_SHK.code.object_oriented.day13.polymorphismTest2;

public class Test1_FieldMethod {
    public static void main(String[] args){
        Sub s = new Sub();
        System.out.println(s.count);
        s.display();
        Base b = s;
        // ==: 对于引用数据类型，比较的是两个引用数据类型的地址值是否相同
        System.out.println(b == s);
        System.out.println(b.count); // 多态不适用于属性，因此属性看左边
        b.display();
    }
}

class Base{
    int count = 10;

    public void display(){
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}