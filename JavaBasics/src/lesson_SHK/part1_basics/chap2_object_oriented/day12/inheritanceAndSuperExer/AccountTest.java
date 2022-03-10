package lesson_SHK.part1_basics.chap2_object_oriented.day12.inheritanceAndSuperExer;

/**
 * 练习一、
 * 写一个用户程序测试Account类。在程序中：
 *  创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
 *  使用withdraw方法提款30000元，并打印余额。
 *  在使用withdraw方法提款2500元。
 *  使用deposit方法存款3000元，然后打印余额和月利率。
 */

/**
 * 练习二
 * 写一个用户程序测试CheckAccount类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%、可透支限额为5000元的CheckAccount对象。
 * 使用withdraw方法提款5000元，并打印余额和可透支额。
 * 再使用withdraw方法提款18000元，并打印余额和可透支额。
 * 再使用withdraw方法提款3000元，并打印余额和可透支额。
 */
public class AccountTest {
    public static void main(String[] args) {

        // 练习一
        Account account1 = new Account(1122,20000,0.045);

        account1.withdraw(30000);
        account1.getBalance();

        System.out.println("***********");

        account1.withdraw(2500);
        account1.deposit(3000);
        System.out.println(account1.getBalance());
        System.out.println(account1.getAnnualInterestRate() * 100 + "%");
        System.out.println();
        System.out.println();

        // 练习二
        CheckAccount account2 = new CheckAccount(1122,20000,0.045,5000);

        account2.withdraw(5000);
        System.out.println("账户余额为：" + account2.getBalance() + "; 可透支额为：" + account2.getOverdraft());
        System.out.println("***********");
        account2.withdraw(18000);
        System.out.println("账户余额为：" + account2.getBalance() + "; 可透支额为：" + account2.getOverdraft());
        System.out.println("***********");
        account2.withdraw(3000);
        System.out.println("账户余额为：" + account2.getBalance() + "; 可透支额为：" + account2.getOverdraft());
    }
}
