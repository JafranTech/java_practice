interface  payment{
    abstract void pay();
}
interface refund{
    abstract void refund();
}

class upipayment implements payment,refund{
    @Override
    public void pay() {
        System.out.println("payment succesful");
    }

    @Override
    public void refund() {
        System.out.println("refund succesful");
    }
}


public class task4 {
    public static void main(String[] args) {
        upipayment upi = new upipayment();
        upi.pay();
        upi.refund();
    }
}
