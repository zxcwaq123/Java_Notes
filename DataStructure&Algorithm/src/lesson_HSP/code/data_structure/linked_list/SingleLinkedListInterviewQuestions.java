package lesson_HSP.code.data_structure.linked_list;

import java.util.Stack;

/*
1. 获取单链表中的倒数第k个节点【新浪】
2. 单链表的反转【腾讯】---> 头插法
3. 从尾到头(逆序)打印单链表【百度，方式1：反向遍历(不推荐，会改变原链表)；方式2：stack栈】
4. 合并两个有序的单链表，使合并之后依然有序。(归并排序)

 */
public class SingleLinkedListInterviewQuestions {
    public static void main(String[] args) {
        //测试
        //先创建节点
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "林冲", "豹子头");

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
        singleLinkedList2.update(new HeroNode(2, "小卢", "小麒麟"));
        //显示
        singleLinkedList2.listNode();
        //反转链表
        invertList(singleLinkedList2.getHead());
        //显示
        System.out.println("反转后的链表为：");
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

        //测试获取倒数第k个节点
        System.out.println("测试获取倒数第K个节点：");
        System.out.println(getInverted(singleLinkedList2.getHead(), 2));
        System.out.println();

        //显示
        singleLinkedList2.listNode();
        //逆序打印
        System.out.println("测试逆序打印：");
        printInvert(singleLinkedList2.getHead());
        System.out.println();
    }

    /**
     * @param head 链表的头结点
     * @return 返回有效节点的个数
     * @Description 获取单链表的节点个数（不统计头结点）
     * @思路： 1. 编写一个方法，接收链表的head节点，和参数k
     * 2. 遍历链表，获取链表长度
     * 3. 遍历链表，第（Length - k）个即为所求节点。
     * 4. 找到返回该节点，否则返回null
     */
    public static HeroNode getInverted(HeroNode head, int k) {
        //判断是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return null;
        }
        // 遍历链表，获取长度
        int length = 0;
        HeroNode temp = head.next;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        // 再次遍历链表，获取第（length - k）个节点
        // 判断k是否小于length
        if (k <= 0) {
            System.out.printf("所给参数'%d'小于或等于0，参数不正确。\n", k);
            return null;
        } else if (k > length) {
            System.out.printf("所给参数%d大于链表长度%d，节点不存在。\n", k, length);
            return null;
        } else {
            //添加辅助指针
            temp = head.next;
            for (int i = 0; i < length - k; i++) { //移动length - k次，第一个不用移动，因此不包括
                temp = temp.next;
            }
            return temp;
        }
    }

    /**
     * @Description 单链表的反转(头插法)
     * @思路 1. 创建一个临时头节点，tempHead
     * 2. 遍历原链表，依次取出节点
     * 3. 每取出一个节点，都插入到临时头结点的后面
     * 4. 将Head.next = tempHead.next
     */
    public static void invertList(HeroNode head) {
        //判断是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        } else if (head.next.next == null) {
            System.out.println("链表只有一个节点，无需反转。");
            return;
        }
        // 遍历链表
        HeroNode tempHead = new HeroNode(0, "", "");//创建临时头结点
        HeroNode temp = head.next; //辅助指针1
        // 遍历原链表
        while (temp != null) {
            HeroNode temp2 = temp.next; //辅助指针2，指向辅助指针1(当前节点)的下一个节点
            temp.next = tempHead.next;  //将temp指向新链表的第一个节点
            tempHead.next = temp; // 将新链表的头结点指向temp
            temp = temp2; // 通过辅助指针2，将辅助指针1后移
        }

        // 将head指向新链表
        head.next = tempHead.next;
    }

    /**
     * @Description 从尾到头(逆序)打印单链表
     * @思路：利用栈，将各个节点压入到栈中，利用栈的先进先出的特点，就实现了逆序打印
     */
    public static void printInvert(HeroNode head) {
        //判断是否为空
        if (head.next == null) {
            System.out.println("链表为空！");
            return;
        }

        //逆序遍历
        Stack<String> invert = new Stack<>();
        HeroNode temp = head.next;
        while (temp != null) {
            invert.push(temp.toString()); //顺序压入栈中
            temp = temp.next;
        }

        //出栈，利用while循环
        while (invert.size() > 0){
            System.out.println(invert.pop());
        }
    }
}
