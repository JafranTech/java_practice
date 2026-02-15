package assesment;
import java.util.Scanner;
public class mini_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("enter the value 1 :");
        int a = sc.nextInt();

        System.out.print("enter the value 2 :");
        int b = sc.nextInt();
        sc.nextLine();
        System.out.println("Select the opertors : +,-,*,/,%");
        String operators = sc.nextLine();

        switch(operators){
            case "+":
                int addition = a+b;
                System.out.println("addition is : " + addition);
                break;

        }

    }
}
