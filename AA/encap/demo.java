package encap;


class dem{
    private int acc_no;
    private int bal;

    

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }
}
public class demo {
    public static void main(String[] args) {
        dem d = new dem();
        d.setAcc_no(23300);
        System.out.println(d.getAcc_no());
    }
}
