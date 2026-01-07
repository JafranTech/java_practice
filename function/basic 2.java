package function;
import java.util.Scanner;

public class basic 2 {

    
    String sum(String a){
        return "my name is " + a;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        basic one = new basic();

        System.out.print("enter the name of  a:");
        String a=sc.nextLine();

        String name = one.sum(a);
        System.out.print(name);
        sc.nextInt();

     


    

        
    
    }
}


