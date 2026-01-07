
import java.util.Scanner;

public class jafran {

    
    String sum(String a){
        return "my name is " + a;
    }

    Long hello(Long b){
        return  b;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        jafran one = new jafran();

        System.out.print("enter the name of  a:");
        String a=sc.nextLine();

        String name = one.sum(a);
        System.out.println(name);
        





        System.out.print("enter the mobile number  of  a:");
        Long b=sc.nextLong();

        Long number = one.hello(b);
        System.out.println(number);

     


    

        
    
    }
}


