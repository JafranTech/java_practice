package assesment.task;

import java.util.Scanner;

public class alpha1 {
    public static void main(String[] args) {
        int [] alphabet = new int[26];

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the text: ");
        String text = sc.next();

        for(int i =0;i<=text.length()-1;i++){
            char ch = text.charAt(i);
            int index= ch - 'a';
            alphabet[index]++;
        }
        for(int i =0;i<=text.length()-1;i++){
            char ch = text.charAt(i);
            int index= ch - 'a';

            if(alphabet[index]!=0){
                System.out.print(ch +""+alphabet[index]);
                alphabet[index]=0;

            }
            
        }
        
    }
}
