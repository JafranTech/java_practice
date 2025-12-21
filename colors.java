import java.util.Scanner;
class colors{
    public static void main(String arg []){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the traffic color:red or yellow or green choose one color :");
        String a = sc.nextLine();
        
        if(a.equals("red")){
            System.out.print("stop");
        }
        else if(a.equals("yellow")){
            System.out.print("ready to go");
        }
        else if(a.equals("green")){
            System.out.print("GOOOOO");
        }
        else{
            System.out.print("invalid color");
        }
    }
}