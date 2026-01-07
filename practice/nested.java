public class nested {
    public static void main(String args[]) {
        int mark = 80;

        if (mark >= 35) {
            System.out.println("Pass");

            if (mark > 60) {
                System.out.println("Mobile");

                if (mark > 80) {
                    System.out.println("Laptop");
                } else {
                    System.out.println("No Laptop");
                }

            } else {
                System.out.println("No Mobile");
            }

        } else {
            System.out.println("Fail");
        }
    }
}
