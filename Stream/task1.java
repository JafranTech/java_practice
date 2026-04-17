import java.util.*;

public class task1 {

    public static void main(String[] args) {
        List<String> n = List.of("mj", "arun", "ram", "john", "mj", "ram");

        List <String> v =n.stream()
            .distinct()
            .map(x->x.toUpperCase())
            .filter(x->x.length()>3)
            .sorted()
            .toList();

            System.out.println(v);
    }
}