

class details {
    int age;
    String name;
    private int pin;

    details(int age , String name,int pin) {
        this.age = age;
        this.name = name;
        this.pin=pin;
        System.out.println("name :" +name+"age : "+age);
    }
    
    boolean pas(int pi){
        if (pi==pin) {
           return true; 
        }
        else{
            return false;
        

        
        
    }
}
}

public class cons {

    public static void main(String[] args) {
        details c = new details(18,"jafran",7474);
        details c1 =new details(21,"hafiz",8888);


        boolean entry = true;
        boolean v=c.pas(7474);
        while (v==entry) {
            System.out.println("wlecome!!");
            break;
        }
        
        
    }
}