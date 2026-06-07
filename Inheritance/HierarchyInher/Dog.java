public class Dog extends Animal{
    void eat(){                   //eat is used in parent and child...it is method overriding
        super.eat();                  // caling parent class
        System.out.println("Dog - eat");
    }
    void bark(){
        System.out.println("Dog - bark");
        System.out.println("Accessing protected variable :" +super.id);
    }
}          