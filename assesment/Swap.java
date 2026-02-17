package assesment;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b=11;
        System.out.println("before swapping : ");
        System.out.println(a);
        System.out.println(b);

        System.out.println("after swapping");
        int temp=a;
        a=b;
        b=temp;


        System.out.println(a);
        System.out.println(b);
    }
}
