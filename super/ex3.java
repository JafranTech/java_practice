class person{
    String name;

    person(){
        
    }
}

class employee extends person{
    int employeeid;

    employee(){
        super.name="jafran";
        employeeid=18;
        
    }


    void display(){
        System.out.println("name is :" + name);
        System.out.println("age is :" + employeeid);
    }
}

public class ex3 {
    public static void main(String[] args) {
        employee e = new employee();
        e.display();
    }
    
    
    
}