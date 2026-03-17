

class animal{
 void sound(){
    System.out.println("walkingg!!1");
 }
 void hello(){
    System.out.println("hello");
 }
}
class dog extends animal{
    void sound(){
        System.out.println("bow bow");
    }
}

public class mul {

    public static void main(String[] args) {
        animal a = new dog();
        a.sound();
        a.hello();
        animal aa = new animal();
        aa.sound();
    }
}