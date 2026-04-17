package Exception;

import java.util.*;

public class bubb {
    public static void main(String[] args) {
        int arr[]={22,33,1,5};

        System.out.println(Arrays.toString(arr));
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                int temp = arr[j];
                if (arr[j]>arr[j+1]) {
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
