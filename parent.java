class Vehicle {
    void fuel() {
        System.out.println("Uses fuel");
    }
}

class Car extends Vehicle {
    void wheels() {
        System.out.println("4 wheels");
    }
}

class Bike extends Vehicle {
    void wheels() {
        System.out.println("2 wheels");
    }
}

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.fuel();

        Bike b = new Bike();
        b.fuel();
    }
}
