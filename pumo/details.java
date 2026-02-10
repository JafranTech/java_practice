package pumo;

import java.util.Scanner;

class Emailexception extends Exception {
    Emailexception(String s) {
        super(s);
    }
}

public class details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you name :");
        String name = sc.nextLine();

        System.out.print("enter your age : ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.print("enter your gender : ");
        String gender = sc.nextLine();

        System.out.print("enter your address : ");
        String address = sc.nextLine();

        System.out.print("enter your mobile");
        long mobile = sc.nextLong();

        sc.nextLine();

        System.out.print("enter you email address:");
        

        
        try {
            String email = sc.nextLine();
            if (email != "@") {
                throw new Emailexception("email must have @");

            } else {

            }
        } catch (Emailexception e) {
            System.out.println(e);

        }
    }
}
