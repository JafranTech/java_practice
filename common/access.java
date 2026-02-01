class person {
    public String name;
    protected int age;
    private int socialsecuritynumber;
    String address;

    int value = socialsecuritynumber=18;

    
}

class employee extends person{
    employee(String name,int age,int socialsecuritynumber,String addresss){
        this.name=name;
        this.age=age;
        
        this.address=addresss;

        System.out.println(name + "\n" + age + "\n" + addresss );

        System.out.println(value);

        
        
    }

    

}


public class access {
    public static void main(String[] args) {
        employee e = new employee("jafran",18,99,"crescent");
    }
    
}