package assesment;

public class Palindrome {

    ///using number
    public static void main(String[] args) {
        int og = 121;
        int num = og;
        int reverse = 0;

        while (num>0) {
            int digit = num%10;
            s

            reverse=reverse*10+digit;
            System.out.println("rev"+reverse);
            num = num/10;
            System.out.println("num"+num);
            
        }

        if (og==reverse) {
            System.out.println("Palindorme");
        }
        else{
            System.out.println("NOt palindorme");
        }
        
    }
}
