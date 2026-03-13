class car {
    String name;
    int year;
}

public class new1 {

    public static void main(String[] args) {
        // int count = 0;
        // int n [] = new int[5];
        // for(int nn : n){
        // n[nn]=10;
        // count=count+n[nn];

        // }
        // System.out.println(count);

        car n = new car();
        car n1 = new car();
        car n2 = new car();

        n.name = "bmw";
        n.year = 2022;

        n1.name = "audi";
        n1.year = 1922;

        n2.name = "ferrari";
        n2.year = 2000;

        car c[] = new car[3];

        c[0] = n;
        c[1] = n1;
        c[2] = n2;

        // for(int i = 0;i<c.length;i++){
        // System.out.println(c[i].name+" "+c[i].year);
        // }

        for (car cc : c) {
            System.out.println(cc.name + " " + cc.year);
        }

    }
}