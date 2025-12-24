import java.util.Scanner;

public class fro1 {
    public static void main(String args[]){
         int evencount =0;
         int oddcount =0;
       
        for (int i=1;i<=10;i++){
            if(i%2==0){
               System.out.println("even :"+(i));
               evencount++;
            }
            else{
               System.out.println("odd :"+(i));
               oddcount++;
            }
            System.out.println("no of even :"+(evencount));
            System.out.println("no of odd :"+(oddcount));
        }

    }
}
