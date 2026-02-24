package assesment.task_oops.gpt;
import java.util.Scanner;

class BankAccount{
    private long acc_no;
    public float balance=10000;
    void depositMoney(int amount,int pin){

    } 
    
    
    void accountInfo(long acc_no){
        this.acc_no=acc_no;
    }

    String accinfo(){
        return "Your accoun no is :"+acc_no;
    }
}

class deposit extends BankAccount{
    @Override
    void depositMoney(int amount,int pin) {
        int og=pin;
        while (og==1234) {
            balance = balance + amount; 
        System.out.println("deposited amount is : " + amount);
        System.out.println("remaining balance : "+balance);
        }
        
        
    }

    

}

public class basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the acc no : ");
        long acc=sc.nextLong();

        BankAccount ba = new BankAccount();
        ba.accountInfo(acc);
        System.out.println(ba.accinfo());

        System.out.print("enter the 4 digit pin ");
        int pin = sc.nextInt();

        System.out.print("enter the deposit amount : ");
        int dep=sc.nextInt();

        ba = new deposit();
        ba.depositMoney(dep,pin);

        

    }
}
