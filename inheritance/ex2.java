package inheritance;
class vehicle{
    String brand;
    int year;

    void startengine(){
    }
}

class car extends vehicle{
    String fueltype;

    void startengine(){
        System.out.println("car engine starts");
    }
}


    void drive(){
        System.out.println("car is driving");
    }


class truck extends vehicle{
    int loadcapacity;
    @Override
    void startengine() {
        System.out.println("truck engine is start");
    }

    void haul(){
        System.out.println("truck is hauling");
    }
}
public class ex2 {

    
}