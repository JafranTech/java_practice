
import java.util.Scanner;

public class use_and {
    public static void main(String args []){

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number:");
        int number=sc.nextInt();



        

        if (number%3==0 && number%5==0){
            System.out.print("yes this is divisable by 3 and 5");
        }
        else{
             System.out.print("no, this is not divisable by 3 and 5");
        }
        
    }
}
