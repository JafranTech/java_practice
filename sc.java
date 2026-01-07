public class find {
    void evenorodd(int a){
        if(a%2==0){
            System.out.print("even");
        }
        else{
            System.out.print("odd");
        }
    }

    public static void main(String args []){
        find one = new find();
        one.evenorodd(5);
    }
}
