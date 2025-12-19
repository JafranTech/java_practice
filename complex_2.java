import java.util.Scanner;

class complex_2{
    public static void main(String arg []){
       Scanner sc = new Scanner(System.in);
       
        System.out.print("enter the name:");
        String name = sc.nextLine();

        sc.nextLine(); 
        
        System.out.print("enter the score out of 100:");
        int score = sc.nextInt(); 

        double score1 = score/10;

        System.out.print("enter the dept:");
        String dept = sc.nextLine(); 


        System.out.println("name : " + name );
        System.out.println("score : " + score1 );
        System.out.println("dept : " + dept );

    }
}