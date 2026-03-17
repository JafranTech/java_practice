class Payment{
    void gpayy(){

    }
    void netbank(){

    }
}
class gpay extends Payment{
    @Override
    void gpayy() {
        System.out.println("gpay bank");
    } 
}
class net extends Payment{
    @Override
    void netbank() {
        System.out.println("net ");
    }
}
public class Access {

    public static void main(String[] args) {
        
    }
}