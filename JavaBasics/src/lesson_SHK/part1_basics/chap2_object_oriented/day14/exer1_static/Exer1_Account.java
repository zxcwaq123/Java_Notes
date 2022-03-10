package lesson_SHK.part1_basics.chap2_object_oriented.day14.exer1_static;

public class Exer1_Account {

    public static void main(String[] args) {

        Account a1 = new Account();
        Account a2 = new Account("dhsng123",3000);

        System.out.println(a1.getId());
        System.out.println(a2.getId());
    }
}

class Account{
    private int id; // 账号
    private String passwd = "0000000"; // 密码
    private double balance; // 余额

    private static double annualInterestRate; // 年利率
    private static double minBalance; // 最小余额
    private static int init = 1001; // 用于自动生成id

    public Account(){
        id = init++;
    }

    public Account(String passwd, double balance){
        this();
        this.passwd = passwd;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }
}