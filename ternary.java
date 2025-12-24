import java.util.Scanner;
public class ternary {
    public static void main(String args []){
        System.out.print("enter the sitiuation rain or not: ");
        Scanner sc = new Scanner(System.in);
        String rain =sc.nextLine();
        
        

       String a =  (rain.equals("rain"))?"take umbrella":"not needed";
       System.out.print(a);
    }
}
