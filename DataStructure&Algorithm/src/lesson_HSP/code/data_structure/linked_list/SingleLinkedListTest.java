package lesson_HSP.code.data_structure.linked_list;
/*
***题目：添加、遍历水浒英雄
* 方式一：直接添加在链表的尾部

***思路
一、添加（创建）
    1. 先创建一个head头结点，作用是表示单链表的头
    2. 后面每添加一个节点，就直接加入到链表的最后
二、遍历
    1. 通过一个辅助变量，帮助遍历整个链表
 */
public class SingleLinkedListTest {
    public static void main(String[] args) {
        //测试
        //先创建节点
        HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3 = new HeroNode(3,"吴用","智多星");
        HeroNode hero4 = new HeroNode(4,"林冲","豹子头");

        //加入
        //1. 创建链表
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        //加入
        singleLinkedList.addNode(hero1);
        singleLinkedList.addNode(hero2);
        singleLinkedList.addNode(hero3);
        singleLinkedList.addNode(hero4);
        //显示
        singleLinkedList.listNode();
    }
}

//定义SingleLinkedList 管理英雄
class SingleLinkedList{
    //先初始化一个头结点
    private HeroNode head = new HeroNode(0,"",""); //不存放具体的数据

    //添加节点到单向链表
    //思路：当不考虑编号的顺序时
    //1. 找到当前链表的最后节点
    //2. 将最后节点的next 指向 新的节点
    public void addNode(HeroNode heroNode){

        //因为head节点不能动，因此需要一个赋值变量temp
        HeroNode temp = head;
        while (true){
            //找到链表的最后
            if(temp.next == null){
                break;
            }
            //如果没有找到，将temp后移
            temp = temp.next;
        }
        //当退出循环时，temp指向链表的最后
        //此时，将next指向新的节点
        temp.next = heroNode;
    }

    //显示链表[遍历]
    public void listNode(){
        //判断链表是否为空
        if(head.next == null){
            System.out.println("链表为空！");
            return;
        }
        //因为head节点不能动，因此需要一个赋值变量temp来遍历
        HeroNode temp = head.next;
        while (true){
            if(temp == null){
                System.out.println("遍历完成！");
                break;
            }
            //输出节点信息
            System.out.println(temp);
            //将指针后移
            temp = temp.next;
        }

    }

}

//定义HeroNode类，每个HeroNode对象就是一个节点
class HeroNode{
    public int no; //排序
    public String name; //姓名
    public String nickName; //诨号
    public HeroNode next; //指向下一个节点

    //构造器
    public HeroNode(int no, String name, String nickName){
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    //为了显示方便，重写toString
    public String toString(){
        return "HeroNode [ no = " + no + " ]\t name = " + name + "\t nickName = " + nickName;
    }
}