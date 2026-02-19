package assesment.task;

import java.util.Scanner;

public class alpha {

    public static void main(String[] args) {
        int []alphabet=new int[26];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter : ");
        String name = sc.nextLine();

        for(int i=0;i<=name.length()-1;i++){
            char ch =name.charAt(i);
            int index = ch - 'a';
            alphabet[index]++;

        }

        for(int i=0;i<=name.length()-1;i++){

            char ch =name.charAt(i);
            int index = ch - 'a';

            if ( alphabet[index] !=0) {
                System.out.println(ch+" " + alphabet[index]);
                alphabet[index]=0;
            }
        }

    }
}