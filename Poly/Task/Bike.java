class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle {
    void start() {
        super.start();  
        System.out.println("Bike is starting");
    }
    public static void main(String[] args) {
        Bike b = new Bike();
        b.start();
    }
}
