/**
 * @author atguigu
 * @create 2020-07-07 6:53 PM
 */


/*
 * 银行有一个账户。有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 *
 */

class Account {
    private double balance;

    public Account() {
        super();
    }


    public Account(double balance) {
        super();
        this.balance = balance;
    }


    public synchronized void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "存钱成功，余额" + balance);
        }
    }

}

class Customer extends Thread {
    private Account acct;
    public Customer(Account acct) {
        this.acct = acct;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }

}


public class AccountTest  {

    public static void main(String[] args) {

        Account acct = new Account(0);
        Customer c1 = new Customer(acct);
        Customer c2 = new Customer(acct);

        c1.setName("A");
        c2.setName("B");

        c1.start();
        c2.start();

    }
}
