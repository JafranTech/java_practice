package pumo.Inheritance.proper;



class Parent{
    int age =18;
    void Name(){
        System.out.println(age);
        System.out.println("Mufasa");
    }
}

class son extends Parent{
    

    
    void sonname() {
        age=99;
        System.out.println(age);
        System.out.println("child class");
        System.out.println("Mufasa son");
    }
}


public class Single {

    public static void main(String[] args) {

        son s = new son();
        s.Name();
        s.sonname();
        
    }
}