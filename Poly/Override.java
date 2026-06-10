/*class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {

    void sound() {       //Overriding same method with no parameter
        System.out.println("Dog barks");
    }
}
public class Override {
    public static void main(String[] args) {
     // Dog d=new Dog();
     // Animal a=new Animal();
        Animal a = new Dog();   //Runtime polymorphism
        a.sound();              
    }
}*/

// Runtime Polymorphism

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}
class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting");
    }
}
public class Override {
    public static void main(String[] args) {
        Vehicle v = new Car();      
        v.start();       
    }
}
