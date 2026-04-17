import java.util.*;

public class st1 {

    public static void main(String[] args) {
       List <Integer> ls = List.of(5, 12, 8, 20, 15);

       ls.stream()
         .peek(x->System.out.println("Before :"+x))
         .map(x->x*2)
         .peek(x->System.out.println("After:"+x))
         .forEach(System.out::println);
        

       System.out.println(ls);

    }
}