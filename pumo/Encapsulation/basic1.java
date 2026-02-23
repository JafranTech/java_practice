package pumo.Encapsulation;

import Functions_pumo.returnn;

public class basic1 {
    private int age;
    private String name;

    

    void Details(int age,String name ){
        this.age=age;
        this.name=name;
        
    }

    int HiddenDetails(){
        return age;
        
    }


    public static void main(String[] args) {
        basic1 bs = new basic1();
        
        bs.Details(18, "Jafran");
        System.out.println(bs.HiddenDetails());
    }
}
