package Exception;
import java.util.*;
class No extends Exception{
    No(String n){
        super(n);
    }
}
public class basic1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age=sc.nextInt();

        try{
            if (age<0) {
                throw new No("Because you are not valid input kidd!!");
            }else{
                System.out.println("You are Eligble to Vote");
            }
        }catch(No e){
            System.out.println("You are not eligble to vote : "+e);
        }

        
    }
}