package lesson_HSP.code.data_structure.linked_list;

import java.util.Stack;

//演示栈Stack的基本使用
public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("1");
        stack.add("2");
        stack.add("3");

        //出栈，利用while循环
        while (stack.size() > 0){
            System.out.println(stack.pop());
        }
    }
}
