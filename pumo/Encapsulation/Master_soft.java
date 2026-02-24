package pumo.Encapsulation;

import java.util.Scanner;



//master doft for IT department
public class Master_soft {
    private long rrn;
    private String password;
    long range =230081601001l;

    public boolean setrrn(long rrn){
        
        if (rrn>=range) {
            this.rrn=rrn; 
            return true;
        }else{
            return false;
        }
    }

    public long getrrn(){
        return rrn;
    }

    public void setpassword(String password){
        if (password.length() >=8) {
            this.password=password;
        }
        else{
            System.out.println("Pass must be 8 letters");
        }
    }

    public String getPassword(){
        return "*********";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Master_soft ms = new Master_soft();

        Boolean valid = false;

        while (!valid) { //valid ==false
            System.out.print("Enter the RRN :");
        long rrn = sc.nextLong();
        valid = ms.setrrn(rrn);

        if (!valid) { //valid ==false
            System.out.println("rrn must be start at 230081601040.");
        }
        }
        

        

        
        System.out.println(ms.getrrn());

        

        System.out.print("Enter the Password :");
        String password = sc.next();

        ms.setpassword(password);
        ms.getPassword();
    }
}
