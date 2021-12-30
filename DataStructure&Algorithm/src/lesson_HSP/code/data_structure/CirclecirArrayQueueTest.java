package lesson_HSP.code.data_structure;

import java.util.Scanner;

/*
将数组队列优化：——>环形队列
1. 重新定义front和rear
    将front指向队列的第一个元素
    将rear指向队列的最后一个元素的下一位 ——> 因此，数组需要预留一个空间，即rear指向的空间
2. 因此，初始值变为：
    front：0
    rear：0
3. 当队列满时:（rear + 1) % maxSize = front
4. 当队列为空时：rear == front
5. 队列中有效数据的个数：(rear + maxSize - front) % maxSize
 */
public class CirclecirArrayQueueTest {
    public static void main(String[] args) {
        //测试
        System.out.println("测试数组模拟环形队列：");
        CircleArray cirQueue = new CircleArray(6); //最大有效数据个数 = 数组长度 - 1，即 5 个。
        char key = ' '; //接收用户输入
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        //输出一个菜单
        while(loop){
            System.out.println();
            System.out.println("--------------------");
            System.out.println("s(show): 显示队列");
            System.out.println("e(exit): 退出程序");
            System.out.println("a(add): 添加数据到队列");
            System.out.println("g(get): 从队列中取数据");
            System.out.println("n(number): 数组中有效数据个数");
            System.out.println("h(head): 查看队列头数据");
            System.out.println("r(rear): 查看队列尾数据");
            System.out.print("请输入选项：");
            key = scan.next().charAt(0); //接收一个字符
            switch(key){
                case 's':
                    cirQueue.showQueue();
                    break;
                case 'e':
                    scan.close();
                    loop = false;
                    break;
                case 'a':
                    System.out.print("请输入需要添加的数据：");
                    cirQueue.addQueue(scan.nextInt());
                    break;
                case 'g':
                    try{
                        int res = cirQueue.getQueue();
                        System.out.println("提取的数据为：" + res);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'n':
                    System.out.println("数组中有效数据个数为：" + cirQueue.size());
                    break;
                case 'h':
                    try{
                        int res = cirQueue.peekFront();
                        System.out.println("队列头的数据为："+ res);
                    }catch(Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'r':
                    try{
                        int res = cirQueue.peekRear();
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


class CircleArray{
    private int maxSize; // 表示数组的最大容量
    private int front; //队列头，指向队列的第一个元素
    private int rear; //队列尾，指向队列的最后一个元素的下一位
    private int[] arr; //该数组用于存放数据，来模拟队列

    //创建队列的构造器
    public CircleArray(int maxSize){
        this.maxSize = maxSize;
        arr = new int[maxSize];
    }

    //判断队列是否满
    public boolean isFull(){
        return (rear + 1) % maxSize == front;
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
            // 将数据加入
            arr[rear] = data;
            //将rear后移，超出界限则循环
            rear = (rear + 1) % maxSize;
        }
    }

    //数据出队列
    public int getQueue(){
        //判断队列是否空
        if(isEmpty()){
            //抛出异常
            throw new RuntimeException("队列为空，无法取出数据！");
        }else {
            //因为return要放在最后，而front需要加1，因此需借助临时变量
            //1.将数组[front]的值保存到临时变量
            //2.将front后移，超出界限则循环（取模）
            //3.将临时变量返回
            int temp = arr[front];
            front = (front + 1) % maxSize;
            //将数据取出
            return temp;
        }
    }

    //求当前队列有效数据个数
    public int size(){
        return (rear + maxSize - front) % maxSize;
    }

    //显示队列的所有数据
    public void showQueue(){
        if(isEmpty()){
            System.out.println("队列为空，没有数据！");
            return;
        }else {
            //思路：从front开始遍历
            for(int i = front; i < front + size(); i++){
                System.out.printf("arr[%d] = %d \n", i % maxSize, arr[i % maxSize]);
            }
        }
    }

    //显示队列的头数据
    public int peekFront(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据");
        }else {
            return arr[front];
        }
    }

    //显示队列的尾数据
    public int peekRear(){
        if(isEmpty()){
            throw new RuntimeException("队列为空，没有数据");
        }else {
            return arr[(rear + maxSize -1) % maxSize];
        }
    }
}