package lambda;
public interface InnerLambdaTest {
    void hello();

    
}
public class LambdaTest {

    public static void main(String[] args) {
        InnerLambdaTest i => (){
            System.out.println("hello");
        };

        
    }
}