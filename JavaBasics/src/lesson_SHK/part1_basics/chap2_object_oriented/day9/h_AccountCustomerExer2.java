package lesson_SHK.part1_basics.chap2_object_oriented.day9;

public class h_AccountCustomerExer2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane","Smith");

        bank.getCustomer(0).setAccount(new Account(2000,5000,1.3));

        bank.getCustomer(0).getAccount().withdraw(2000);
        bank.getCustomer(0).getAccount().deposit(22);

        System.out.println("账户id:" + bank.getCustomer(0).getAccount().getId() + " 账户余额:" + bank.getCustomer(0).getAccount().getBalance() + " 账户年利率:" + bank.getCustomer(0).getAccount().getAnnualInterestRate() + "%");
    }

}

class Bank{
    private Customer [] customers;
    private int numberOfCustomers;

    public Bank(){
        customers = new Customer[100];
    }

    public void addCustomer(String f, String l){
        customers[numberOfCustomers++] = new Customer(f,l);
    }

    public int getNumberOfCustomer() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers){
            return customers[index];
        }else {
            return null;
        }
    }
}