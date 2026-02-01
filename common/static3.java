class demo{
    static int age;


    demo(int age){
        this.age=age;
    }

    void value(){
        System.out.println("age is :" + age);
    }
}


public class static3 {
    public static void main(String[] args) {
        demo d = new demo(18);
        d.value();

        demo d1 = new demo(20);
        d1.value();
        
    }
    
}
