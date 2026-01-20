class animal{
    animal(String type){
        System.out.println(type);
    }

    
}


class dog extends animal{
    dog(){
        super("hello");
        System.out.println("dog");
    }
}

public class ex1 {

    public static void main(String[] args) {
        
        dog d = new dog();
        
    }
}