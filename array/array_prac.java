import java.util.Scanner;
public class array_prac {
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size:");
        int size = sc.nextInt();
        int [] hello = new int[size];
        int total = 0;

       for(int i =0;i<=size-1;i++){
        System.out.print("enter the number:");
        hello[i]=sc.nextInt();
        total = total + hello[i];
       }
       System.out.print("Total marks: " + total);
       
    }
}
