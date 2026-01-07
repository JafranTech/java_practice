public class for3 {
    public static void main(String args []){
       
        int a=1;
        int n=100;

        for (int i=a;i<=n;i++){
            if (i%3==0 && i%5==0){
                System.out.println("this number is didvisable by both 2 and 5:" + (i));
            }
            else{
                System.out.println("this number is not didvisable by both 2 and 5:" + (i));
            }
        }
    }
}
