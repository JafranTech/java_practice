package assesment.task_oops.gpt;
import java.util.Scanner;   // For user input



public class ATMSystem {

    // BankAccount class inside same file (only one public class allowed)
    static class BankAccount {

        private long accNo;        // Account number (Encapsulation)
        private double balance;    // Balance must be private
        private int pin;           // PIN must never be public

        // Constructor to initialize account
        public BankAccount(long accNo, double balance, int pin) {
            this.accNo = accNo;      // Assign account number
            this.balance = balance;  // Set initial balance
            this.pin = pin;          // Set PIN
        }

        // Verify PIN
        public boolean verifyPin(int enteredPin) {
            return this.pin == enteredPin;   // Return true if PIN matches
        }

        // Deposit method
        public void deposit(double amount) {
            if (amount > 0) {                  // Validate amount
                balance += amount;             // Add to balance
                System.out.println("Deposited: " + amount);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Withdraw method
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {   // Check balance
                balance -= amount;                   // Deduct amount
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance or invalid amount.");
            }
        }

        // Check balance
        public void checkBalance() {
            System.out.println("Current Balance: " + balance);
        }

        // Transfer method
        public void transfer(BankAccount receiver, double amount) {
            if (amount > 0 && amount <= balance) {   // Validate transfer
                balance -= amount;                   // Deduct from sender
                receiver.balance += amount;          // Add to receiver
                System.out.println("Transfer successful.");
            } else {
                System.out.println("Transfer failed.");
            }
        }
    }

    // Main method – JVM entry point
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create two sample accounts
        BankAccount user1 = new BankAccount(1001, 10000, 1234);
        BankAccount user2 = new BankAccount(1002, 5000, 4321);


        int attempt =1;
        boolean isVerified=false; //becaus now it false till th e3 attemp it will 
                                //false card will be blocked

        while (attempt<=3) {
             System.out.print("Enter PIN: ");
        int enteredPin = sc.nextInt();

        if (user1.verifyPin(enteredPin)) {
            isVerified=true;
            break;

            
        }else{
            attempt++;
            System.out.println("invalid pin try again");
        }
        }
       if (isVerified==false) {
        System.out.println("your card will be blocked");
        sc.close();
        return;

       }

        

        // PIN verification before transaction
        
        

        System.out.println("\n1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Transfer");

        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter deposit amount: ");
                double dep = sc.nextDouble();
                user1.deposit(dep);
                break;

            case 2:
                System.out.print("Enter withdraw amount: ");
                double wd = sc.nextDouble();
                user1.withdraw(wd);
                break;

            case 3:
                user1.checkBalance();
                break;

            case 4:
                System.out.print("Enter transfer amount: ");
                double tr = sc.nextDouble();
                user1.transfer(user2, tr);
                break;

            default:
                System.out.println("Invalid option.");
        }

        sc.close();   // Always close scanner
    }
}