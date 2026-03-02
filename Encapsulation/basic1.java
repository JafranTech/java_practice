import java.util.Scanner;

class account {
    private long acc_no;
    private int pin;

    private int balance;

    account(long acc_no, int pin) {
        this.acc_no = acc_no;
        this.pin = pin;
        this.balance = 0;
    }

    boolean pin(int value) {
        if (value == pin) {
            return true;
        } else {
            return false;
        }
    }

    int getbalance() {
        return balance;
    }

    long getaccountnumber() {
        return acc_no;
    }

    void deposit(int amount){
            if(amount>0){
            balance=balance+amount;
        System.out.println("deposited amount :"+amount);
        System.out.println("remaing balance : "+balance);
        }
        else{
            System.out.println("Invalid amount!!");
        }
    }

    void withdraw(int withd) {
        if (withd <= balance && withd > 0) {
            balance = balance - withd;
            System.out.println("withdrawal amount :" + withd);
            System.out.println("remaing balance : " + balance);
        } else {

            System.out.println("Invalid amount!!");
        }

    }
}


public class basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        account a = new account(230081601040l, 7474);
        System.out.println("enter the pin: ");
        int value = sc.nextInt();


        boolean validate = a.pin(value);

        while (validate) {
            System.out.println("(1)Check balance:");
            System.out.println("(2)Deposit:");
            System.out.println("(3)Withdraw:");
            System.out.println("(4)Exit:");

            System.out.println("Enter the key :");
            int key = sc.nextInt();

            switch (key) {
                case 1:
                    System.out.println(a.getbalance());
                    break;

                case 2:
                    System.out.println("enter the deposit amount: ");
                    int amount = sc.nextInt();
                    a.deposit(amount);
                    break;

                case 3:
                    System.out.println("enter the withdraw amount: ");
                    int withd = sc.nextInt();
                    a.withdraw(withd);
                    break;

                case 4:
                    validate=false;
                    break;

                default:
                    break;
            }

        }
        System.out.println(validate);

    }
}
