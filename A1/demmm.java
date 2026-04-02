package A1;

import java.util.Scanner;

public class demmm {

    public static void main(String[] args) {
       
      Scanner sc=new Scanner(System.in);

      System.out.println("Enter row Size");

      int row=sc.nextInt();

      String arr[][]=new String[row][];

      
      for(int i=0;i<row;i++){
        System.out.println("Enter "+i+" index row . how many column you give");
          
        int col=sc.nextInt();

        arr[i]=new String[col];

        for( int j=0;j<col;j++){
            System.out.println("Enter ["+i+"]"+"["+j+"] index value");

            arr[i][j]=sc.next();

        }

      }

      
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            System.out.print(arr[i][j]+" ");

        }
        System.out.println();
      }



    }
}