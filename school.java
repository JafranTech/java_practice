import java.util.Scanner;

public class school {
    String passorfail(int a){
        if(a>35){
            return "pass";

        }

        else{
            return "fail";
        }
    }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the mark:");
        int mark = sc.nextInt();

        school sl=new school();
         System.out.print("you are :"+(sl.passorfail(mark)));



        
    }
}
