
class Bike extends Vehicle {
    void ride() {
        super.start();
        System.out.println("Bike is riding");
    }
}
class Car extends Vehicle {
    void drive() {
        super.start();
        System.out.println("Car is driving");
    }
}
public class Main1 {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.drive();

        Bike b = new Bike();
        b.start();
        b.ride();
    }
}
