class hello {
     int age;
    String name;
    static String college;

    // static void show(){
    // System.out.println(age);
    // }

    // static{
    // System.out.println("sttaic blockk");
    // }

    // void display() {
    //     System.out.println("name : " + name + " " + "age : " + age + " " + "college name : " + college);
    // }

    // static int  always(int a , int b){
    //     return a+b;
    // }
    static void details(hello h){
        System.out.println("name : " + h.name + " " + "age : " + h.age + " " + "college name : " + college);
    }
}


public class static1 {
    public static void main(String[] args) {

        // int value = hello.always(5, 5);
        // System.out.println(value);

        // hello h = new hello();
        // hello.details("");


        // hello.age=19;
        // // hello h = new hello();
        // // h.show();

        // hello.show();


        hello.college = "crescent";
        hello h = new hello();
        h.age = 18;
        h.name = "jafran";
        // h.display();
        hello.details(h);

        hello h1 = new hello();
        h1.age = 29;
        h1.name = "hameed";
        // h1.display();
        hello.details(h1);

        

        // hello h2 = new hello();
        // h2.age = 17;
        // h2.name = "jasam";
        // h2.display();

    }
}
