package conditional;
import java.util.Scanner;
public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your marks: ");
        int mark1= sc.nextInt();
        int mark2= sc.nextInt();
        int mark3= sc.nextInt();
        int mark4= sc.nextInt();
        int mark5= sc.nextInt();

        int total = mark1+mark2+mark3+mark4+mark5;

        float average = total/5f;

        System.out.println("total: "+total);
        System.out.println("average: "+average);

        if(average>=90 && average<=100){
            System.out.println(" A grade");
        }
        else if(average>=80 && average<90) {
            System.out.println("b grade");
        }
        else if(average>=70 && average<80) {
            System.out.println("c grade");
        }
        else if(average>=60 && average <70) {
            System.out.println("d grade");
        }
        else if(average>=50 && average <60) {
            System.out.println("e grade");
        }
        else{
            System.err.println("fail or invalid input try again");
        }
        
    }
}
