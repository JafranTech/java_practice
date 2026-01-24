//functional interface



interface a{
    void display();
}



public class lambda1 {
    public static void main(String[] args) {
        a obj = new a(){
            public void display(){
                System.out.println("hello world");
            }
        };
        obj.display();

    }
    
}