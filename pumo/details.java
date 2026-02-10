package pumo;

import java.util.Scanner;

class Emailexception extends Exception {
    Emailexception(String s) {
        super(s);
    }
}

class Mobile_number_not_valid extends Exception{
    Mobile_number_not_valid(String a){
        super(a);
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

        try{
            long mobile = sc.nextLong();
            int length = String.valueOf(mobile).length();

            if(mobile != length) {
                throw new Mobile_number_not_valid("invalid number:number should be minimum 10 numbers");
            }
            else{

            }
            

        }catch(Exception e){
            System.out.println(e);
        }
        

        sc.nextLine();

        
        System.out.print("enter you email address:");
        

        
        try {
            String email = sc.nextLine();
            if (!email.contains("@")) {
                throw new Emailexception("email must have @");

            } else {

            }
        } catch (Emailexception e) {
            System.out.println(e);

        }

        
    }
}
