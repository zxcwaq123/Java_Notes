package lesson_HSP.code.data_structure;

import java.util.Scanner;

public class ArrayQueueTest1 {
    public static void main(String[] args) {
        //测试
        //创建一个队列
        ArrayQueue arrayQueue = new ArrayQueue(3);
        char key = ' '; //接收用户输入
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while(loop){
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列中取数据");
            System.out.println("h(head): 查看队列头数据");
            System.out.println("r(rear): 查看队列尾数据");
            System.out.print("请输入选项：");
            key = scan.next().charAt(0); //接收一个字符
            switch(key){
                case 's':
                    arrayQueue.showQueue();
                    break;
                case 'e':
                    scan.close();
                    loop = false;
                    break;
                case 'a':
                    System.out.print("请输入需要添加的数据：");
                    arrayQueue.addQueue(scan.nextInt());
                    break;
                case 'g':
                    try{
                        int res = arrayQueue.getQueue();
                        System.out.println("提取的数据为：" + res);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'h':
                    try{
                        int res = arrayQueue.peekFront();
                        System.out.println("队列头的数据为："+ res);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'r':
                    try{
                        int res = arrayQueue.peekRear();
                        System.out.println("队列头的数据为："+ res);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                default:
                    break;
            }


        }
        System.out.println("程序退出！");

    }
}


//使用数组模拟队列-编写一个ArrayQueue类
class ArrayQueue{
    private int maxSize; // 表示数组的最大容量
    private int front; //队列头
    private int rear; //队列尾
    private int[] arr; //该数组用于存放数据，来模拟队列

    //创建队列的构造器
    public ArrayQueue(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = rear = -1; //初始化：front指向队列头的前一个位置，rear指向队列尾部（包含队列尾部的数据）
    }

    //判断队列是否满
    public boolean isFull(){
        return rear == maxSize -1;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return rear == front;
    }

    //添加数据到队列
    public void addQueue(int data){
        //判断队列是否满
        if(isFull()){
            System.out.println("队列满，不能加入数据！");
            return;
        }else {
            arr[++rear] = data;
        }
    }

    //数据出队列
    public int getQueue(){
        //判断队列是否空
        if(isEmpty()){
            //抛出异常
            throw new RuntimeException("队列为空，无法取出数据！");
        }else {
            return arr[++front]; //front后移，出队列
        }
    }

    //显示队列的所有数据
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空，没有数据！");
            return;
        }else {
            for(int i = front+1; i <= rear; i++){
                System.out.printf("arr[%d] = %d \n", i, arr[i]);
            }
        }
    }

    //显示队列的头数据
    public int peekFront(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据");
        }else {
            return arr[front+1];
        }
    }

    //显示队列的尾数据
    public int peekRear(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据");
        }else {
            return arr[rear];
        }
    }
}