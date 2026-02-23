package pumo.Encapsulation;



public class College {
    private Long rrn ;
    private String password;

    void Details(Long rrn,String password ){
        this.rrn=rrn;
        this.password=password;
    }

    String DisplayDetails(){
        return "RRN : "+rrn+"\nPassword : "+password;
    }
    public static void main(String[] args) {
        College c = new College();
        c.Details(230081601040l, "hellohello");
    }
}
