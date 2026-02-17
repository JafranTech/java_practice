
package pumo.Inheritance;

import pumo.Inheritance.proper.A;
import pumo.Inheritance.proper.B;

class A {
    void show() {
        System.out.println("A show");
    }
}

class B extends A {
    void display() {
        System.out.println("B display");
    }
}

public class doubt {

    public static void main(String[] args) {
        B obj = new B();
        //left side reference tpe and right side object type 
        A obj1=obj; //for   A refernce object a we send thebobject 
                    //which means b extends a is this valid
    }
}