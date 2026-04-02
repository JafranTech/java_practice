package Collection;

import java.util.*;

public class mapp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Map <String,Integer> ma=new HashMap<>();
        
        
        int n =2;
        System.out.println("Enter the name and RRN: ");
        for(int i =0;i<n;i++){
            ma.put(sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }

        System.out.println(ma);

        ma.remove("Fazil");
         System.out.println(ma);
        System.out.println("Search the FJafran Name : ");
         if (ma.containsKey("Jafran")) {
            System.out.println("Yes his name already in thi List");
         }else{
            System.out.println("NOPE!!!");        }


            
        System.out.println(ma.get("Jafran"));
        
    }
}
