class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        super.eat();
        System.out.println("bow bow");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.eat();   // inherited
        // obj.bark();  // own method
    }
}
