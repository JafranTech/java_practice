
import java.util.Scanner;

class question2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter rcb is win or loose :");
        String rcb = sc.nextLine();
        
        if(rcb.equals("win")){
            System.out.print("eesala cup namadheyy");
        }
        else if(rcb.equals("loose")){
            System.out.print("cup illa");
        }
        else{
            System.out.print("invalid input");
        }

        sc.close();
    }
}
