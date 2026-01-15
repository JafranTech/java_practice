class one{
    int a=5;
}

class two extends one{
    int b=5;
    
}

public class single{
    public static void main(String args[]){
        two t = new two();
        System.out.print("addition is :" + (t.b + t.a));
    }
}