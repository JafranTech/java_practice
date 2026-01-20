class A {
    int x = 10;

    A() {
        System.out.println("Parent constructor");
    }

    void show() {
        System.out.println("Parent method");
    }
}

class B extends A {
    int x = 20;

    B() {
        super();   // calls parent constructor
        System.out.println("Child constructor");
    }

    void display() {
        System.out.println(super.x); // parent variable
        super.show();               // parent method
    }
}

class ex2 {
    public static void main(String[] args) {
        B obj = new B();
        obj.display();
    }
}
