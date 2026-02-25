import java.util.Scanner;



public class basic {

    static class Innerbasic {
        private long accno;
        private int pin;
        private int balance;


        public Innerbasic(long acc_no, int pin,int balance){
            this.accno=acc_no;
            this.pin=pin;
            this.balance=balance;
        }
        public boolean verifypin(int pin){
            return this.pin==pin;
            
        }

        public void deposit(int depo){
            balance=balance+depo;
            System.out.println("Deposited amount is :" + depo);
            System.out.println("remaining balance :"+balance);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Innerbasic user1 = new Innerbasic(230081601040L, 7474, 500);
        Innerbasic fazil_acc = new Innerbasic(230081601030L, 4747, 500);

        int attempt=1;
        boolean is_verified=false;
        

        while (attempt<=3) {
            System.out.print("enter the pin");
        int pin =sc.nextInt();
            if (user1.verifypin(pin)==true) {
                System.out.println("correct pin");
                is_verified=true;
                break;
            }
            else{
                System.out.println("invalid pin");
                attempt++;
            }
        }
        if (is_verified==false) {
            System.out.println("card block");
            sc.close();
            return;
        }

        System.out.println("enter ");


        


    }
}