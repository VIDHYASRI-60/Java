//Abstraction

/*public class Gpay extends Payment{
    //override
    void pay(){
        System.out.println("Gpay:Pay");
    }
}*/


//Interface

public class Gpay implements Payment{
    //override
    public void pay(){
        System.out.println("Gpay");
    }
    public void display(){
        System.out.println("Gpay default");
    }
}