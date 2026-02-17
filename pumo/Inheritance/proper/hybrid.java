package pumo.Inheritance.proper;



    class a {
        void aa() {
            System.out.println("class a");
        }
    }

    class b extends a {
        void bb() {
            System.out.println("class b");
        }
    }

    class c extends a {
        void cc() {
            System.out.println("class c");
        }
    }

    class d extends b {
        void dd() {
            System.out.println("class d");
        }
    }
public class hybrid {
    public static void main(String[] args) {
        d obj= new d();
        obj.aa();
        obj.bb();
        obj.dd();
        
        c obj1=new c();
        obj1.cc();
        



    }
}
