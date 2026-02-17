package pumo.Inheritance.proper;

import Functions_pumo.voidd;

class A{
    void Aa(){
        System.out.println("class a");
    }
}

class B {
    void Bb(){
        System.out.println("class b");
    }
}

class C extends A,B{
    void Cc(){
        System.out.println("class c");
    }
}





public class Multi {
    public static void main(String[] args) {
        C obj = new C();
        obj.Bb();

    }
}
