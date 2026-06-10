// Abstraction

/*public abstract class Payment{
    //just creating constructor for abstract class
    Payment(){
        System.out.println("Abstract Constructor");
    }
    abstract void pay();
    void display(){
        System.out.println("Display");
}
}*/

//Interface

public interface Payment{
    abstract void pay();
    default void display(){
        System.out.println("Default method ");
    }
}