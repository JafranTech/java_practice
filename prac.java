class prac{

    int age ;


    int hello(int age){
        this.age=age;
        return age;
    }
    public static void main(String args []){
        prac a = new prac();
        int value= a.hello(18);
        System.out.println(value);
    }
}