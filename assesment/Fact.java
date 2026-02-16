package assesment;
import java.util.*;
public class Fact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Factorial and factprial answer is even or odd
        System.out.print("Enter the Number : ");
        int num =sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+"is :"+fact);


        if (fact % 2 ==0) {
            System.out.println("Factorial of " + num  +" is : Even"  );
        }
        else{
            System.out.println("Factorial of " + num + " is : Odd");
        }
    }
}
