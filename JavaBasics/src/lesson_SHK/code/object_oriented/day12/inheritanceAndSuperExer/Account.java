package lesson_SHK.code.object_oriented.day12.inheritanceAndSuperExer;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(){

    }

    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance -= amount;
        }else {
            System.out.println("余额不足");
        }
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }else {
            System.out.println("金额输入错误！");
        }
    }
}
