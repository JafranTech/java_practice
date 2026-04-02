package A1;
import java.util.*;
public class jasam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <String> arr = new ArrayList<>();
        System.out.println("enter the Student limit value:");

        int limit = sc.nextInt();

        sc.nextLine();
        

        for(int i =0;i<limit;i++){
            System.out.print("Enter the studennt name: ");
            String name= sc.nextLine();
            arr.add(name);
        }
        System.out.println("Failure student name was removed :"+arr.remove(1));
        System.out.println(arr);
        System.out.println("Class topper : "+arr.get(1));
        System.out.println(arr.set(1, "Mark"));
        System.out.println(arr);
        
        

    }
}