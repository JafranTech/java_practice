class Parent {
    int money = 10000;

    void house() {
        System.out.println("Parent house");
    }
}

class Child extends Parent {
    void car() {
        System.out.println("Child car");
    }

    public static void main(String[] args) {
        Parent par = new Parent();
        par.house();

    }
}
