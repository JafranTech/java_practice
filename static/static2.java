class a {
    static void name() {
        System.out.println("class a");
    }
}

class b extends a {
    static void name() {
        System.out.println("class b");
    }
}

public class static2 {
    public static void main(String[] args) {
        a obj = new b();
        obj.name();
    }
}
