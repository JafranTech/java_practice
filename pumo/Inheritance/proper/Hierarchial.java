package pumo.Inheritance.proper;

class shape {
    void display() {
        System.out.println("shape");
    }
}

class triangle extends shape {
    void area() {
        System.out.println("traingle");
    }
}

class circle extends shape {
    void area() {
        System.out.println("circle");
    }
}

public class Hierarchial {
    public static void main(String[] args) {
        triangle t = new triangle();
        circle c = new circle();

        c.area();
        c.display();

        t.display();
        t.area();
    }
}
