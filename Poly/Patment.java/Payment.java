
import java.util.*;

class payment {
    int balance = 1500;

    void pay(int amount) { // parent method must contain the sneding amount value that time only it will
                           // work
        /*
         * Compiler checks reference type.
         
         * Runtime checks object type.
         
         * Parent must declare method for polymorphism to work.
         */

    }
}

class CreditCardPayment extends payment {

    @Override
    void pay(int amount) {
        
        System.out.println("CreditCardPayment");
        balance = balance - amount;
        System.out.println("Balance : " + balance);
    }

}

class UPIpayment extends payment {
    @Override
    void pay(int amount) {
        System.out.println("UPIpayment");
        balance = balance - amount;
        System.out.println("Balance : " + balance);
    }
}

class Gpay extends payment {
    @Override
    void pay(int amount) {
        System.out.println("Gpay");
        balance = balance - amount;
        System.out.println("Balance : " + balance);
    }
}

public class Payment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Choose the payment method " + "\n(1):\tCreditCardPayment" + "\n(2):\tUPIpayment" + "\n(3):\tGpay");

        System.out.print("Enter th payment option : ");
        int option = sc.nextInt();
        payment p;

        if (option == 1) {
            System.out.print("Enter the amount :");
            int amount = sc.nextInt();
            p = new CreditCardPayment();
            p.pay(amount);
        }

        else if (option == 2) {
            System.out.print("Enter the amount :");
            int amount = sc.nextInt();
            p = new UPIpayment();
            p.pay(amount);
        }

        else if (option == 3) {
            System.out.print("Enter the amount :");
            int amount = sc.nextInt();
            p = new Gpay();
            p.pay(amount);
        }

        else {
            System.out.println("Invalid option!!1");
        }

    }

}

// int CreditCardPayment = sc.nextInt();
// int UPIpayment = sc.nextInt();
// int Gpay = sc.nextInt();