package pumo;

import java.util.Scanner;

public class mobile_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your mobile");

        long mobile = sc.nextLong();

        String s = String.valueOf(mobile);
        int len = s.length();

        System.out.println(len);

        if (len == 10) {
            System.out.println("valid number");
        } else {
            System.out.println("invalid number ");
        }
        // if () {
        // System.out.println("invalid num");

        // } else {
        // System.out.println("successfully regiterd mobile number");
        // }

    }
}
