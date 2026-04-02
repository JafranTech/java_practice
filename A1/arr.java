import java.util.*;


class arr {

    public static void main(String[] args) {
        Set<Integer> arr = new HashSet<>();

        arr.add(4);
        arr.add(5);
        arr.add(4);

        System.out.println(arr);

        Iterator<Integer> ref=arr.iterator();

        while (ref.hasNext()) {
            System.out.println(ref.next());
        }
    }

}
