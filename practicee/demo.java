class A extends Thread{
    void run(){
        int n =50;
        for(int i = 1;i<=n;i++){
            System.out.println("one");
        }
        
    }
}
class B {
    void run(){
        int n =50;
        for(int i = 1;i<=n;i++){
            System.out.println("two");
        }
        
    }
}
public class demo {
    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();

        a1.run();
        b1.run();
    }
}
