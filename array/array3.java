import java.util.Scanner;
public class array3 {
    public static void main(String args[]){
        int[] mark = new int [5];
        Scanner sc = new Scanner(System.in);
        int n=4;
        for (int i = 0; i<=n;i++){
            System.out.print("enter the mark"+(i)+":");
            mark[i]=sc.nextInt();
        }
        

        int marks = mark[0]+mark[1]+mark[2]+mark[3]+mark[4];

        System.out.print("total marks : " + (marks));

    }
}
