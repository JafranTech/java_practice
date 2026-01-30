import java.util.Scanner;



public class exh2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int a = sc.nextInt();
        }
        catch(Exception e){
            System.out.println("error happend:"+e);
        }
        finally{
            System.out.println("successfully ended");
        }
    }
    
}