abstract class animal {
    abstract void species();

    void walk() {
        System.out.println("animal are walk!!");
    }
}

class lion extends animal {
    @Override
    void species() {
        System.out.println("cat family!!");
    }

}

public class abs {
    public static void main(String[] args) {
        animal a = new lion();
        a.walk();
        a.species();
    }

}