package lesson_SHK.code.object_oriented.day9;
/*
写一个测试程序：
1. 创建一个Customer，名字叫Jane Smith，他有一个账号1000，余额为2000元，年利率1.23%。
2. 对Jane Smith账户进行操作，存入100元，取出960元，再取出2000元。
打印出Jane Smith的基本信息
 */

public class g_AccountCustomerExer {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane","Smith");
        customer.setAccount(new Account(1000,2000,1.23));
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);
        System.out.println(customer.getFirstName() + " " + customer.getLastName());
        System.out.println("账户id:" + customer.getAccount().getId() + " 账户余额:" + customer.getAccount().getBalance() + " 账户年利率:" + customer.getAccount().getAnnualInterestRate() + "%");



    }

}

class Account{

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId(){
        return id;
    }

    public double getBalance(){
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // 提款方法中，需要判断余额是否能满足提款要求，如果不能，需给出提示。
    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("成功取出：" + amount + "元，余额：" + balance + "元。");
        }else {
            System.out.println("余额不足，取款失败！");
        }
    }

    public void deposit(double amount){
        balance += amount;
        System.out.println("成功存入：" + amount + "元，余额：" + balance + "元。");
    }
}

class Customer{
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String f, String l){
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account){
        this.account = account;
    }
}