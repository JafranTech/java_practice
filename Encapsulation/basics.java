
import java.util.*;



public class basics {
    private int pin;
    private int withdrawal;
    private int deposit;
    private int balance = 10000;
    public int defaultpin = 7474;

    void pin(int pin){
        this.pin=pin;
        System.out.println(pin);
    }
    boolean correctpin(){
        if (pin==defaultpin) {
            return true;
        }
        else{
            return false;
        }
    }

    public void withdrawal(int withdraw){
        balance=balance-withdraw;
        System.out.println("withdraw amount:"+withdraw);
    }

    public void deposit(int depo){
        balance=balance+depo;
        System.out.println("deposit amount:"+depo);
    }

    public void balance(){
        System.out.println("balance amount :"+balance);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        basics b = new basics();

        System.out.println("enter the pin:");
        int pin=sc.nextInt();
        System.out.println(b.pin);
        
            while (og==true) {
                System.out.println("enter the option 1.deposit" + "\n2.balance"+"3.witdraw");
            sc.next();

            System.out.println("enter the option:");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("enter the deosit amount :");
                    int depo=sc.nextInt();
                   b.deposit(depo);
                    break;
                case 2:
                    System.out.println("enter the withdrawal amount :");
                    int withdraw=sc.nextInt();
                   b.deposit(withdraw);
                    break;

                case 3:
                    b.balance();
                    break;
                default:
                    break;
            }

            System.out.println("invalid amount");
            }
            

        }

    }
