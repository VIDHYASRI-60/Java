public class Cat extends Animal{
    void eat(){                   //eat is used in parent and child...it is method overriding
        super.eat();                  // caling parent class
        System.out.println("Cat - eat");
    }
    void meow(){
        System.out.println("Cat - meows");
    }
} 