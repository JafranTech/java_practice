

interface A{
    abstract void name();
}

interface B{
    abstract void name();
}

class C implements A,B{
    @Override
    public void name() {
        System.out.println("hello this is interface");
    }
}
public class basics {

    public static void main(String[] args) {
        C obj = new C();
        obj.name();
    }
}