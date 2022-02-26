package lesson_SHK.code.object_oriented.day12.inheritanceAndSuperExer;

public class CheckAccount extends Account{
    private double overdraft;

    public CheckAccount(){

    }

    public CheckAccount(double overdraft){
        this.overdraft = overdraft;
    }

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public void withdraw(double amount){
        if(amount <= getBalance()){
            //setBalance(getBalance() - amount);
            super.withdraw(amount);
        }else if (amount <= getBalance() + overdraft){
            overdraft -= (amount - getBalance());
            setBalance(0);
        }else {
            System.out.println("用户超过可透支限额！");
        }
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }
}
