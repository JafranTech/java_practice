import java.util.Scanner;
public class array5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the the size of the array:");
        int size =sc.nextInt();
        int[] mark = new int [size];//mark is empty array named as mark elements are stored in the inside mark
        
        for (int i = 0; i<=size-1;i++){
            System.out.print("enter the the mark:");
            mark[i]=sc.nextInt();
            
        }
        
    }
}
