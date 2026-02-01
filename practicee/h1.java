class calculator{
    int calculate(int a , int b){
        int sum = a+b;
        return sum;
    }

    int calculate(int a , int b,int c){
        int average = (a+b+c)/3;
        return average;
    }

    double calculate(double price, double tax){
        double final_price = price + (price*tax)/(100);
        return final_price;
    }

}

public class h1{
    public static void main(String[] args) {
        calculator c = new calculator();

        int var =c.calculate(10, 5);
        int var1 =c.calculate(10, 5,6);
        double var2 =c.calculate((double)15000,(double)10);

        System.out.println(var + "\n" + var1 + "\n" + var2);
    }
}