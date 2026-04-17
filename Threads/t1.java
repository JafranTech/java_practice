class A extends Thread{
    public void run() {
        System.out.println("one");
    };
}

class B extends A implements Runnable{
    public void run(){
        super.run();
        System.out.println("two");
    }
    
}

public class t1 {

    public static void main(String[] args) {

        B obj = new B();
        obj.start();   
    }
}