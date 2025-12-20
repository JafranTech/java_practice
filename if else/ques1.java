import java.util.Scanner;

public class ques1 {
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the income:");
        int nu,ber=sc.nextInt();

        

        if (income > 7000){
            System.out.print("eligable");
        }
        else if(income<=6900) {
             System.out.print("not eligable");
        }
        else{
             System.out.print("invalid ");
        }
    }
}
