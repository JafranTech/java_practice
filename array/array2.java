import java.util.Scanner;
public class array2 {
    public static void main(String args[]){
        int[] mark = new int [5];
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the mark 1: ");
        mark[0]=sc.nextInt();
        System.out.print("enter the mark 2: ");
        mark[1]=sc.nextInt();
        System.out.print("enter the mark 3: ");
        mark[2]=sc.nextInt();
        System.out.print("enter the mark 4: ");
        mark[3]=sc.nextInt();
        System.out.print("enter the mark 5: ");
        mark[4]=sc.nextInt();

        int marks = mark[0]+mark[1]+mark[2]+mark[3]+mark[4];

        System.out.print("total marks : " + (marks));

    }
}
