// package Patterns.level1;

// public class demo1 {
//     public static void main(String[] args) {
//         int n =3;
//         for(int i =1; i<=n; i++){ //row - outer loop
//             for(int j =1;j<=n;j++){ //column - inner loop
//                 System.out.print("*");

//             }
//             System.out.println();
//         }
//     }
// }

// package Patterns.level1;

// public class demo1 {

//     public static void main(String[] args) {
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

package Patterns.level1;

// public class demo1 {

//     public static void main(String[] args) {
//         char a = 'a';
//         int aa=1;
//         for(int i=1;i<=3;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(aa);
//                 aa++;
//             }
//             System.out.println();
//         }
//     }
// }

public class demo1 {

    public static void main(String[] args) {
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('a' + j - 1));
            }
            System.out.println();
        }

    }
}
