// Abstract class
/*
abstract class Employee {
    abstract void calculateSalary();   
    void displayDetails() {             
        System.out.println("Employee details");
    }
}

// Subclass 1
class FullTimeEmployee extends Employee {
    int salary = 50000;
    void calculateSalary() {
        System.out.println("Full Time  Salary: " + salary);
    }
}

// Subclass 2
class PartTimeEmployee extends Employee {
    int hours = 20;
    int ratePerHour = 500;
    void calculateSalary() {
        int salary = hours * ratePerHour;
        System.out.println("Part Time Salary: " + salary);
    }
}

public class Task {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee();
        e1.displayDetails();
        e1.calculateSalary();

        Employee e2 = new PartTimeEmployee();
        e2.displayDetails();
        e2.calculateSalary();
    }
}*/

//Interface

/*
interface Printable {
    void print();
}
interface Scannable {
    void scan();
}

class Printer implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document");
    }
    public void scan() {
        System.out.println("Scanning document");
    }
}

public class Task {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.print();
        p.scan();
    }
}*/

//Final Method

/*class Parent {
    final void show() {
        System.out.println("This is a final method");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("Trying to override");
    }
}
public class Task{
    public static void main(String[] args){
        Child c=new Child ();
        c.show();
    }
}*/


//Final class

final class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}
public class Task{
    public static void main(String[] args){
        Bike b = new Bike();
        b.start();
        b.run();
    }
}

