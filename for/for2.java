import java.util.Scanner;

public class for2 {
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
        }
        System.out.println("total no of odd and even :");
        System.out.println("total no of odd is :"+ (oddcount));
        System.out.println("total no of even is :"+ (evencount));


    }
}
