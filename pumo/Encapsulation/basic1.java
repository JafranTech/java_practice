package pumo.Encapsulation;



public class basic1 {
    private int age;
    private String name;

    String Greeting(){
        return "Welcome";
    }

    void Details(int age,String name ){
        this.age=age;
        this.name=name;
        System.out.println(age + "\n"+name);
    }


    public static void main(String[] args) {
        basic1 bs = new basic1();
        System.out.println(bs.Greeting());
        bs.Details(18, "Jafran");
    }
}
