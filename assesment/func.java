package assesment;

public class func {

    static String name(String name1){ // with argument 
        return"I am "+ name1;                 // with return type
    }

    static void age(){  //no argument 
        int age=18 ;
        System.out.println("my age is : "+ age); // no return type
    }

    static String exp(){ //no argeument with return type
        int exp = 5;
        return "years of experince is "+ exp;
    }

    static void address(String address){
        System.out.println(address); //with argument no return type

    }
    public static void main(String[] args) {
        System.out.println(name("Jafran")); //calling the // with argument  and // with return type function

        age();//calling the //no argument  and //no return type

        System.out.println(exp());// calling the no argument with return type

        address("Chennai");
    }
}
