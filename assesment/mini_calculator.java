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

        switch (operators) {
            case "+":
                int addition = a + b;
                System.out.println("addition is : " + addition);
                break;

            case "-":
                int minus = a - b;
                System.out.println("subtraction is : " + minus);
                break;

            case "*":
                int mul = a * b;
                System.out.println("multiply is : " + mul);
                break;

            case "/":
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                } else {
                    System.out.println("Division: " + (a / b));
                }
                break;

            case "%":
                int mod = a % b;
                System.out.println("modulus is : " + mod);
                break;

            default:
                System.out.println("invalid operators");

        }

    }
}
