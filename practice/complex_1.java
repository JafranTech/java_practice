/*get input for 3 integer variable a and b and c .
 now multiply all vafiable and store
  in d like a*b*c = d then
   now add all variables and stor it in e . 
   now divide d by e*/

import java.util.Scanner;

class complex_1 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the value a:");
        int a = sc.nextInt();

        System.out.print("enter the value b:");
        int b = sc.nextInt();

        System.out.print("enter the value c:");
        int c = sc.nextInt();

        int d = a*b*c;
        System.out.println("d = a*b*c :" + d);

        int e = a+b+c;
        System.out.println("e = a+b+c :" + e);

        int divide = d/e;

        System.out.print("\ndivide d/e is :" + divide);

    }
}