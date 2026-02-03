import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String s) {
        super(s);
    }
}

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        System.out.print("enter the withdrawal amount:");
        int amount = sc.nextInt();
        try {
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficeint fund");
            }
            else{
                int bal = amount-balance;
                System.out.println("balance amount in your account:" + bal);
            }
        } catch (InsufficientBalanceException e) {
            System.out.println(e);
        } finally {
            System.out.println("Ended");
        }

    }
}