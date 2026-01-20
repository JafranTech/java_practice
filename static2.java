class counter{
    static int count=0;
    int instanceNumber=0;

     counter(){
        count++;
        instanceNumber++;
    }

    void value(){
        System.err.println("count:"+count);
        System.out.println("instance:"+instanceNumber);
    }
}

public class static2 {
    public static void main(String[] args) {
        counter c = new counter();
        c.value();

        counter c1 = new counter();
        c1.value();

    }
    
}
