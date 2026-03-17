

public class pal {

    public static void main(String[] args) {
        String name ="dad";
        String rev = "";
        
        for(int i = name.length()-1;i>=0;i--){
            rev = rev+name.charAt(i);

        }
        System.out.println("Reversed :"+rev);
        if (rev.equalsIgnoreCase(name)) {
            System.out.println("palindrome yes");
        }
        else{
            System.out.println("not a palidrome");
        }

    }
}