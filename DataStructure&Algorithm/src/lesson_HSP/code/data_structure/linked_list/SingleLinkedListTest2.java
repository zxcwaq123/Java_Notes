package lesson_HSP.code.data_structure.linked_list;
/*
***题目：添加、遍历水浒英雄
** 方式二：按编号顺序进行添加
***思路
一、添加（创建）
    1. 找到新添加的节点的位置，添加辅助指针temp(即，temp代表该位置上的旧节点)
    2. 让新节点的.next = temp.next
    3. 让temp.next = 新的节点

二、遍历
    1. 通过一个辅助变量，帮助遍历整个链表

***
* 新增链表的修改和删除
* *修改思路
    1. 判断链表是否为空
    2. 遍历找到需要修改的链表
    3. 修改链表的属性

  *删除思路
    1. 先找到需要删除节点的前一个节点,添加辅助指针temp
    2. 让temp.next = temp.next.next;
    3. 被删除的节点将不会有其他引用指向，会被垃圾回收机制回收
 */
public class SingleLinkedListTest2 {
    public static void main(String[] args) {
        //测试
        //先创建节点
        HeroNode hero1 = new HeroNode(1,"宋江","及时雨");
        HeroNode hero2 = new HeroNode(2,"卢俊义","玉麒麟");
        HeroNode hero3 = new HeroNode(3,"吴用","智多星");
        HeroNode hero4 = new HeroNode(4,"林冲","豹子头");

        //加入
        //1. 创建链表
        SingleLinkedList2 singleLinkedList2 = new SingleLinkedList2();
        //加入
        singleLinkedList2.addByOrder(hero4);
        singleLinkedList2.addByOrder(hero1);
        singleLinkedList2.addByOrder(hero2);
        singleLinkedList2.addByOrder(hero3);
        //显示
        singleLinkedList2.listNode();
        //修改
        singleLinkedList2.update(new HeroNode(2,"小卢","小麒麟"));
        //显示
        singleLinkedList2.listNode();
        //删除
        singleLinkedList2.delete(6);
        //显示
        singleLinkedList2.listNode();
        //删除
        singleLinkedList2.delete(1);
        //显示
        singleLinkedList2.listNode();
        //删除
        singleLinkedList2.delete(3);
        //显示
        singleLinkedList2.listNode();
    }
}
class SingleLinkedList2{
    //先初始化一个头结点
    private HeroNode head = new HeroNode(0,"",""); //不存放具体的数据

    //方式二：在添加英雄时，根据其排名将英雄插入到指定位置
    //如果已有该排名，则显示添加失败
    public void addByOrder(HeroNode heroNode){
        //因为head节点不能动，因此需要一个赋值变量temp
        //因为时单链表，因此temp是添加位置的前一个节点
        HeroNode temp = head;
        while (true){
            //找到链表的最后
            if(temp.next == null){
                break;
            }else if(temp.next.no > heroNode.no){//位置找到，就在temp.next之后
                heroNode.next = temp.next;
                temp.next = heroNode;
                System.out.println("已将节点加入");
                break;
            }else if(temp.next.no == heroNode.no){
                System.out.println("编号已存在，无法添加");
                break;
            }
            //如果没有找到，将temp后移
            temp = temp.next;
        }
        //当退出循环时，temp指向链表的最后
        //此时，将next指向新的节点
        temp.next = heroNode;
    }

    //修改节点的信息，根据编号no来修改，即no编号不能改
    //说明
    //1.根据newHeroNode的no来修改
    public void update(HeroNode newHeroNode){
        //判断链表是否为空
        if(head.next == null){
            System.out.println("链表为空！");
            return;
        }

        //找到需要修改的节点，根据no编号
        //定义一个辅助变量
        HeroNode temp = head.next;
        boolean flag = false;
        while (true){
            //找到链表的最后，即已遍历完
            if(temp == null){
                break;
            }else if(temp.no == newHeroNode.no) {
                flag = true;
                temp.name = newHeroNode.name;
                temp.nickName = newHeroNode.nickName;
                System.out.printf("节点%d已修改!\n",newHeroNode.no);
                break;
            }
            //将链表后移
            temp = temp.next;
        }

        if(!flag){
            System.out.println("没有找到节点编号为" + newHeroNode.no + "的节点，不能修改");
        }
        //
    }

    //删除节点
    public void delete(int no){
        //判断链表是否为空
        if(head.next == null){
            System.out.println("链表为空，无法删除！");
            return;
        }

        //添加辅助指针
        HeroNode temp = head;
        while (true){
            // 已遍历完
            if(temp.next == null){
                System.out.printf("要删除的节点%d不存在链表中！\n",no);
                break;
            }else if(temp.next.no == no){
                temp.next = temp.next.next;
                System.out.println("序号为" + no + "的节点已删除。");
                break;
            }
            temp = temp.next;
        }
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
                System.out.println("遍历完成！\n");
                break;
            }
            //输出节点信息
            System.out.println(temp);
            //将指针后移
            temp = temp.next;
        }

    }
}