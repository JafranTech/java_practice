import java.util.Scanner;

class practice_1{
    public static void main(String arg []){
       Scanner sc = new Scanner(System.in);
       
        System.out.print("enter the age:");
        int age = sc.nextInt();

        sc.nextLine();  //indha line vandhu aduthu read pannunu sollum idhu podhulanda pudhusa new aah oru scanner Create panna sollum .
        
        System.out.print("enter the name:");
        String name = sc.nextLine(); 

        System.out.print("enter the address:");
        String address = sc.nextLine(); 


        System.out.print("name : " + name + "\nage:" + age + "\naddress:" + address );

    }
}