public class Creditcard implements InterfaceB , Payment1{
    public void pay(){
        System.out.println("Credit");
    }
    public void display(){
        Payment1.super.display();     //calling interface ...
        System.out.println("Credit default");
    }
    public void disp(){
        System.out.println("Disp");
    }
}
