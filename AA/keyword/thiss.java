class A{
    A(){
        super(); //it is hidden even if we did not create this super;
        System.out.println("I am A");
    }
    A(int x){
        super();
        System.out.println("a parameter condtructor");
    }
}
class B extends A{
    B(){
        super();
        System.out.println("B constructor");
    }
    B(int y){
        this();
        super();        // super(y); //we have to manually do this wehen we call the parameterized one.
        System.out.println("b parameter  constructor");
    }
}

public class thiss {
    public static void main(String[] args) {
        B obj = new B(6);
        
    }
}
