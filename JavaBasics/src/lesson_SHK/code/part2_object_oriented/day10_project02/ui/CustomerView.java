package lesson_SHK.code.part2_object_oriented.day10_project02.ui;

import lesson_SHK.code.part2_object_oriented.day10_project02.bean.Customer;
import lesson_SHK.code.part2_object_oriented.day10_project02.service.CustomerList;
import lesson_SHK.code.part2_object_oriented.day10_project02.util.CMUtility;

import java.util.Scanner;

/*
CustomerView类，为主模块，负责菜单的显示和处理用户操作
1. 本类封装以下信息
    CustomerList customerList = new CustomerList(10);
    创建最大包含10个客户对象的CustomerList对象，供以下各成员方法使用。
2. 该类至少提供以下方法：

 */
public class CustomerView {
    public static void main(String[] args) {
        CustomerView custView = new CustomerView();
        custView.enterMainMenu();
    }

    CustomerList customerList = new CustomerList(10);

    public CustomerView() {
        Customer customer = new Customer("张三", '男', 21, "13333333333", "asdfasd@adf.com"); //默认添加的客户信息
        customerList.addCustomer(customer);
    }

    /**
     * 显示《客户信息管理软件》界面的方法
     */
    public void enterMainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("----------------客户信息管理软件----------------");
            System.out.println("\t\t\t\t\t1.添加客户");
            System.out.println("\t\t\t\t\t2.修改客户");
            System.out.println("\t\t\t\t\t3.删除客户");
            System.out.println("\t\t\t\t\t4.客户列表");
            System.out.println("\t\t\t\t\t5.退   出");
            System.out.print("请选择(1-5): ");
            switch (CMUtility.readMenuSelection()) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("是否确认退出(Y/N): ");
                    if (CMUtility.readComfirmSelection() == 'Y') {
                        flag = false;
                    }
                    break;
            }
        }
    }

    /**
     * 添加客户
     */
    private void addNewCustomer() {
        if (customerList.getTotal() == customerList.getMaxNmu()) {
            System.out.printf("列表已满(%d/%d)，请删除后再插入\n", customerList.getTotal(), customerList.getMaxNmu());
        } else {
            System.out.println("-------------------添加客户-------------------");
            Customer cust = new Customer();
            System.out.print("请输入姓名(10个字符以内，保密请直接回车)：");
            cust.setName(CMUtility.readString(10, "佚名"));
            System.out.print("请输入性别(保密请直接回车)：");
            cust.setGender(CMUtility.readChar('密'));
            System.out.print("请输入年龄(150以内，保密请直接回车)：");
            cust.setAge(CMUtility.readInt(-1));
            System.out.print("请输入手机号(13个字符以内，保密请直接回车)：");
            cust.setPhone(CMUtility.readString(13, "保密"));
            System.out.print("请输入邮箱(20个字符以内，保密请直接回车)：");
            cust.setEmail(CMUtility.readString(20, "保密"));
            customerList.addCustomer(cust);
            System.out.printf("插入成功, 列表状态(%d/%d)。\n", customerList.getTotal(), customerList.getMaxNmu());
        }
    }

    private void modifyCustomer() {
        System.out.println("\n-------------------修改客户-------------------");
        while (true) {
            System.out.printf("列表状态(%d/%d), 请输入需要修改的客户编号(-1退出)：", customerList.getTotal(), customerList.getMaxNmu());
            int num = new Scanner(System.in).nextInt();
            if (num > 0 && num <= customerList.getTotal()) {
                Customer cust = customerList.getCustomer(num - 1);
                System.out.print("姓名( "+ cust.getName()+ "，跳过请直接回车)：");
                cust.setName(CMUtility.readString(10, cust.getName()));
                System.out.print("性别( "+ cust.getGender()+ "，跳过请直接回车)：");
                cust.setGender(CMUtility.readChar(cust.getGender()));
                System.out.print("年龄( "+ cust.getAge()+ "，跳过请直接回车)：");
                cust.setAge(CMUtility.readInt(cust.getAge()));
                System.out.print("手机号( "+ cust.getPhone()+ "，跳过请直接回车)：");
                cust.setPhone(CMUtility.readString(13, cust.getPhone()));
                System.out.print("邮箱( "+ cust.getName()+ "，跳过请直接回车)：");
                cust.setEmail(CMUtility.readString(20, cust.getEmail()));
                System.out.printf("用户%d修改成功\n", num);
                System.out.println();
                break;
            } else if (num == -1){
                break;
            }
            else {
                System.out.println("用户不在列表中，无法修改！\n");
            }
        }
    }

    private void deleteCustomer() {
        System.out.println("\n-------------------修改客户-------------------");
        while (true) {
            System.out.printf("列表状态(%d/%d), 请输入需要修改的客户编号：", customerList.getTotal(), customerList.getMaxNmu());
            int num = new Scanner(System.in).nextInt();
            if (num > 0 && num <= customerList.getTotal()) {
                System.out.print("是否确认删除（Y/N）:");
                char isDelete = CMUtility.readComfirmSelection();
                if (isDelete == 'Y'){
                    customerList.deleteCustomer(num - 1);
                    System.out.printf("用户%d删除成功\n", num);
                }
                break;
            } else if(num == -1){
                break;
            }else{
                System.out.println("用户不在列表中，无法删除！\n");
            }
        }
    }

    /**
     * 查询客户列表
     */
    private void listAllCustomers() {
        System.out.println("-------------------客户列表-------------------");

        int total = customerList.getTotal();
        if (total > 0 && total <= customerList.getMaxNmu()) {
            System.out.println("num\t\tname\tgender\tage\t\tphone\t\t\temail");
            for (int i = 0; i < total; i++) {
                System.out.println((i + 1) + "\t\t" + customerList.getCustomer(i));
            }
        } else {
            System.out.println("暂无客户信息");
        }
        System.out.println();
    }
}
