interface printable {
    void display1();

}

interface showable {
    void display();

}

class document implements printable, showable {
    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("hello");

    }
    @Override
    public void display1() {
        System.out.println("printable");
    }
}

public class inter {
    public static void main(String[] args) {
        document d = new document();
        d.display();
        d.display1();

    }

}