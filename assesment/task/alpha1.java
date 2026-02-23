package assesment.task;

import java.util.Scanner;

public class alpha1 {

    public static void main(String[] args) {
        int alpha[]=new int [26];

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the text : ");
        String input =sc.nextLine();

        for(int i =0;i<input.length();i++){
            char ch = input.charAt(i);
            int index = ch - 'a';
            alpha[index]++;
        }

        for(int i =0;i<input.length();i++){
             char ch = input.charAt(i);
             int index = ch - 'a';
             if (alpha[index]!=0) {
                System.out.print(ch +""+alpha[index]);
                alpha[index]=0;
             }
        }
    }
}