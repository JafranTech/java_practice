package function;
import java.util.Scanner;
public class basic {

    
    int sum(int a , int b){
        return a+b;
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        basic one = new basic();

        System.out.print("enter the numbe a:");
        int a=sc.nextInt();

        System.out.print("enter the numbe b:");
        int b=sc.nextInt();


        int value = one.sum(a,b);
        System.out.print(value);

        
    
    }
}


