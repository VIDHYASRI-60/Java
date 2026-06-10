//VARIABLES
/*public class Variables{
    int i=10; //INSTANCE VARIABLE OR GLOBAL
    static String s="Hello"; // STATIC VARIABLE
    final double f=3.14;  //FINAL VARIABLE

    void display(){
        int l=67; //LOCAL VARIABLE
        System.out.println("BEFORE CHANGE" );
        System.out.println("LOCAL VARIABLE  "+l );
        System.out.println("INSTANCE VARIABLE  "+i );
        System.out.println(" STATIC VARIABLE  "+s );
        System.out.println("FINAL VARIABLE  "+f );
    }
    public static void main(String[] args){
        Variables ob1 = new Variables();   //CREATING OBJECT FOR MODIFY INSTANCE VARIABLE
        Variables ob2 = new Variables();
         
        ob1.i=17;     // for instance
        ob2.display();

        Variables.s ="Java"; //for static

        System.out.println("AFTER CHANGE" );
        System.out.println("INSTANCE VARIABLE FOR OB 1 " + ob1.i);
        System.out.println("INSTANCE VARIABLE FOR OB 2 " + ob2.i);
        System.out.println("FINAL VARIABLE  "+ob1.f );
        System.out.println(" STATIC VARIABLE  "+ s );
    }
}*/


//INSTANCE VARIABLE

/*public class Variables {
    int i = 10;   
    void display() {
        System.out.println("INSTANCE VARIABLE : " + i);
    }
     public static void main(String[] args) {
        Variables ob1 = new Variables();
        Variables ob2 = new Variables();
        ob1.i = 25;   // modify instance variable
        ob1.display();
        System.out.println("OBJECT 1 VALUE : " + ob1.i);
        System.out.println("OBJECT 2 VALUE : " + ob2.i);
    }
}*/

//STATIC VARIABLE

/*public class Variables{
    static String s = "Hello";   
    public static void main(String[] args) {
        System.out.println("BEFORE CHANGE : " + s);
        Variables.s = "Java";   // modify static variable
        System.out.println("AFTER CHANGE : " + s);
    }
}*/

//FINAL VARIABLE

/*public class Variables {
    final double f = 3.14;   
    void display() {
        System.out.println("FINAL VARIABLE : " + f);
    }
    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.display();
    }
}*/



//LOCAL VARIABLE

public class Variables{
    void display() {
        int l = 50;   
        System.out.println("LOCAL VARIABLE : " + l);
    }
    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.display();
    }
}


