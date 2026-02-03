class Product{
    int id;
    String name;
    double price;
    Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
    void display(){
        System.out.println(id + "\n" + name + "\n" + price);
    }
}
class Dis extends Product{
    int discount;
    Dis(int id,String name,double price,int discount){
        super(id,name,price);
        this.discount=discount;
    }
    @Override
    void display() {
        System.out.println(id + "\n" + name + "\n" + price + "\n" + discount);
    }
}

public class task1{
    public static void main(String[] args) {
        Dis d = new Dis(101,"jafran",40.00,19);
        d.display();
    }
}