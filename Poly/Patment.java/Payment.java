
import java.util.*;

class payment {
    int balance = 1500;
    void pay() {

    }
}

class CreditCardPayment extends payment {

    @Override
    void pay() {
        
        System.out.println("CreditCardPayment");
        System.out.println("Balance : "+ balance);
    }

}

class UPIpayment extends payment {
    @Override
    void pay( ) {
        System.out.println("UPIpayment");
    }
}

class Gpay extends payment {
    @Override
    void pay() {
        System.out.println("Gpay");
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
            int amount=sc.nextInt();
            p = new CreditCardPayment();
            p.pay();
        } 

        else if (option == 2) {
            System.out.print("Enter the amount :");
            int amount=sc.nextInt();
            p = new UPIpayment();
            p.pay();
        }
        
        else if (option ==3) {
            System.out.print("Enter the amount :");  
            int amount=sc.nextInt();
            p = new UPIpayment();
            p.pay();
        }

        else{
            System.out.println("Invalid option!!1");
        }

    }

}

// int CreditCardPayment = sc.nextInt();
// int UPIpayment = sc.nextInt();
// int Gpay = sc.nextInt();