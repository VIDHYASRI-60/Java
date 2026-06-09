//Single inheritance
class Bike extends Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
    void ride() {
        super.start();
        System.out.println("Bike is riding");
    }
}

//Multi level ..from vehicle - Bike - Tvs
class Tvs extends Bike{
    void stop(){
        System.out.println("Tvs");
    }
}
//Single inheritance
public class Main1 {
    public static void main(String[] args) {

        Bike b = new Bike();
        b.start();
        b.ride();

//Multilevel
        Tvs t=new Tvs();
        t.ride();
        t.stop();
    }
}
