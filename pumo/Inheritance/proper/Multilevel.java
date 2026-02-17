package pumo.Inheritance.proper;


class animal{
    void walk(){
        System.out.println("animal can walk");
    }
}

class mammal extends animal{
    void eat(){
        System.out.println("animal can eat");
    }
}

class dog extends mammal{
    void sound(){
        System.out.println("bow bow");
    }
}
public class Multilevel {

    public static void main(String[] args) {
        mammal m = new mammal();
        dog d = new dog();

        d.walk();
        d.eat();
        d.sound();
        
    }
}