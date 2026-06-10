/*public class Exception{
    public static void main(String[] args) {
        int i=10;
        try {
            int a = i/0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}*/


/*public class Exception{
    public static void main(String[] args) {
        int i=10;
        try {
            int a = i/0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally{                   //Always executed....
            System.out.println("Finally block");
        }}
    }*/

   public class Exception1{
    public static void main(String[] args) {
        Exception1 a=new Exception1();
        try{
            a.vote(25);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    void vote(int i){
        if(i<18)
        throw new ArithmeticException("Not Eligible" );
        else
        System.out.println("Eligible");
    }}
