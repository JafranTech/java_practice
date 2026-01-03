class Bike {
    String model;
    int speed;

    void run() {
        System.out.println(model + " running at " + speed + " km/h");
    }

    public static void main(String[] args) {

        Bike b1 = new Bike();
        b1.model = "R15";
        b1.speed = 120;
        b1.run();

        Bike b2 = new Bike();
        b2.model = "MT15";
        b2.speed = 110;
        b2.run();
    }
}
