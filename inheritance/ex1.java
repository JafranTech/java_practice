package inheritance;

class animal{
    void makesound(){
        System.out.println("animal make sound");
    }
}

class dog extends animal{
    @Override
    void makesound() {
        System.out.println("barking");
    }

    void fetch(){
        System.out.println("barking");
    }
}

class cat extends animal{
    String type;
    @Override
    void makesound() {
        System.out.println("meow");
    }

    void climb(){
        System.out.println("climbing");
    }
}

public class ex1 {

    public static void main(String[] args) {
        dog d = new dog();
        d.makesound();
        

        cat c = new cat();
        c.makesound();

    }
}