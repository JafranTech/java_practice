import java.util.Scanner;

public class user_input {
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter tha age");
        int a = sc.nextInt();
        sc.nextLine();
       

        System.out.print("enter tha name");
        String b = sc.nextLine();

        System.out.println("age :" + a + "\nname :" + b);

    }
}


        