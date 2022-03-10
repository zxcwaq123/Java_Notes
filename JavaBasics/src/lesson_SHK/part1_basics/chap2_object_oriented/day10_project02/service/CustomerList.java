package lesson_SHK.part1_basics.chap2_object_oriented.day10_project02.service;

import lesson_SHK.part1_basics.chap2_object_oriented.day10_project02.bean.Customer;

/*
CustomerList类的设计：用来管理Customer对象，内部使用数组管理一组Customer

1. 本类封装以下信息
    Customer [] customers; 用来保存客户对象数组
    int total = 0; 记录已保存的客户对象的数量
2. 该类至少提供以下构造器和方法
public CustomerList(int totalCustomer)
public boolean addCustomer(Customer customer)
public boolean replaceCustomer(int index, Customer cust)
public boolean deleteCustomer(int index)
public Customer[] getAllCustomers()
public Customer getCustomer(int index)
public int getTotal()
 */
public class CustomerList {

    private Customer[] customers;
    private int total = 0;

    public CustomerList(int totalCustomer){
        customers = new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){
        if (total >= customers.length){
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    public boolean replaceCustomer(int index, Customer cust){
        if (index >= 0 && index < total){
            customers[index] = cust;
            return true;
        }else {
            System.out.printf("找不到客户%d\n",index);
            return false;
        }
    }

    public boolean deleteCustomer(int index){
        if(index >= 0 && index < total){
            for(int i = index; i < total - 1; i++){
                customers[i] = customers[i+1];
            }
            // customers[total - 1] = null;
            // total--;                  //删减别忘了total--;
            customers[--total] = null;
            return true;
        }
        else{
            System.out.printf("找不到客户%d\n",index);
            return false;
        }
    }

    public Customer[] getAllCustomers(){
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index){
        if (index >= 0 && index < total){
            return customers[index];
        }else {
            System.out.printf("找不到客户%d\n",index);
            return null;
        }
    }

    public int getTotal() {
        return total;
    }

    public int getMaxNmu(){
        return customers.length;
    }
}
