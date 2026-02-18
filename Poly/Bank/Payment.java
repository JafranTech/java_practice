
import java.util.Scanner;

class ChennaiMobiles {
    void Employee() {
        System.out.println("Eligiblity Checking processing....");
    }
}

class HDFC extends ChennaiMobiles {

    void Employee() {
        System.out.println("Eligiblity Not Eligible Rejected HDFC...");
    }
}

class IOB extends ChennaiMobiles {
    void Employee() {
        System.out.println("Eligiblity Not Eligible Rejected IOB...");
    }
}

class Canara extends ChennaiMobiles {

    void Employee() {
        System.out.println("Approved..");
    }
}

public class Payment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = sc.next();
        System.out.println("Enter your Loan Prcessing ");

        while (true) {
            System.out.println("1) HDFC " + "\n" + "2) IOB" + "\n" + "3) Canara" + "\n" + "4) Exit");
            System.out.println("Enter key ");
            int result = sc.nextInt();
            if (result == 1) {
                ChennaiMobiles ChennaiMobiles = new ChennaiMobiles();
                ChennaiMobiles.Employee();
                ChennaiMobiles obj = new HDFC();
                obj.Employee();
            } else if (result == 2) {
                ChennaiMobiles ChennaiMobiles = new ChennaiMobiles();
                ChennaiMobiles.Employee();
                ChennaiMobiles obj = new IOB();
                obj.Employee();
            } else if (result == 3) {
                ChennaiMobiles ChennaiMobiles = new ChennaiMobiles();
                ChennaiMobiles.Employee();
                ChennaiMobiles obj = new Canara();
                obj.Employee();

            } else if (result == 4) {
                System.out.println("Thank For visiting my branch " + name);
                break;
            } else {
                System.out.println("Invalid Input ");
            }
            
        }

    }

}