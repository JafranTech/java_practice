abstract class animal{
    abstract void sound();
}

class cat extends animal{
    void sound(){
        System.out.println("hello world");
    }
}

public class abs1 {

    public static void main(String[] args) {
        cat c = new cat();
        c.sound();
    }
}