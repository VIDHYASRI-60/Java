//Functions
/*public class Functions{
    String s="Java";
    static int x=20;
    public static void main(String []args){
        Functions ob=new Functions();
        ob.Addition();
        System.out.println(Functions.Addition(10,20));
    }
    void Addition(){   //Functions
        System.out.println(s);
    }

    static int Addition(int a,int b){  //Static Functions
        return a+b;
        
    }
} */


//Method Overloading

/*public class Functions{
    public static void main(String []args){
        Functions obj =new Functions();
        System.out.println(obj.total(2,3));
        System.out.println(obj.total("HI"));
        System.out.println(obj.total(24.0,45.9));
        obj.total();
        System.out.println(obj.total(2,3,5));
        
    }
    int total(int i,int y){
        return(i+y);
    }
    String total(String s){
        return(s);
    }
    double total(double a ,double b){
        return(a+b);
    }
    void total(){
        System.out.println("VOID");
    }
    int total(int a ,int b,int c){
        return (a+b+c);
    }
}

//METHOD OVERLOADING

public class Functions {

    public static void main(String[] args) {

        Functions obj = new Functions();

        obj.display(10);                
        obj.display(5.5f);               
        obj.display("Java");             
        obj.display(3, 7);           
        obj.display();                   
    }

    void display(int a) {
        System.out.println("Integer value: " + a);
    }

    void display(float f) {
        System.out.println("Float value: " + f);
    }

    void display(String s) {
        System.out.println("String value: " + s);
    }

    void display(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void display() {
        System.out.println("No arguments method");
    }
}*/

//RECURSION -Factorial

/*public class Functions{
    int recursion(int n){
        if (n==0){
            return 1;
        }
        return n * recursion(n-1);
    }
    public static void main (String[]args){
        Functions obj =new Functions();
        System.out.println(obj.recursion(5));
    }
        }*/
    

//RECURSION FIBONACII

/*public class Functions {

    int Fibo(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }

    public static void main(String[] args) {
        Functions obj = new Functions();
        System.out.print(obj.Fibo(5));
    }
}*/

//MAX OF 3 NUMBERS USING FUNCTION

/*import java.util.Scanner;

public class Functions {
    static int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > c && b>a)
            return b;
        else
            return c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        int result = max(x, y, z);  

        System.out.println("Maximum number is: " + result);
    }
}*/



//POSITIVE OR NEGATIVE 
import java.util.Scanner;
class Functions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0)
            System.out.println("Positive number");
        else if (num < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");
    }
}
