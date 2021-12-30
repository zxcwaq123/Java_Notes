package Lesson_SHK.Code.Object_Oriented.day8;
/*
方法的形参的传递机制：值传递

    1.形参：方法定义时，声明的小括号内的参数
      实参：方法调用时，实际传递给形参的数据

    2.值传递机制：
        如果形参是基本数据类型: 此时实参赋给形参的是实参储存的数据值。
        如果形参是引用数据类型: 此时实参赋给形参的是实参储存的地址值。
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        Data data = new Data();

        data.m = 10;
        data.n = 20;

        System.out.println("m = " + data.m + "\t" + "n = " + data.n);

        ValueTransferTest2 test = new ValueTransferTest2();

        test.swap(data);
        System.out.println("m = " + data.m + "\t" + "n = " + data.n);


    }

    public void swap(Data data){
        int temp = data.m;
        data.m = data.n;
        data.n = temp;
    }
}

class Data{

    int m;
    int n;
}
