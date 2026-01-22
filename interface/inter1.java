interface printable{
    void display();

}

interface showable{
    void display();

}


}

class document implements printable, showable{
    @Override
    public void display() {
        System.out.println("hello");
    }
    
}

class inter1{
    public static void main(String[] args) {
        document d = new document();
        d.display();
    }
}