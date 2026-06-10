public interface Payment1{
    abstract void pay();
    default void display(){
        System.out.println("Default method ");
    }
}