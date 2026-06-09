/*public class MyClass2{
    public static void main(String[] args){
        System.out.println("Hello \n word ");
        System.out.println("Hello\tword ");
        System.out.println("\\Hello word ");
        System.out.println("\'Hello word \'");
        System.out.println("\"Hello word\" ");     
        
    }
}  
*/
import java.util.Scanner;
public class MyClass2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 1st value :");
        int i = sc.nextInt();
        System.out.print("Enter a 2nd value :"); 
        int j = sc.nextInt();
        System.out.println("Arithmetic");
        System.out.println("Addition =" + (i+j));
        System.out.println( "Difference ="+ (i-j));
        System.out.println("Product =" +(i*j));
        System.out.println("Quotient =" +(i/j));
        System.out.println("Remainder ="+(i%j));

        System.out.println("Retaional");
        System.out.println ("i lesser than j :" +(i<j));
        System.out.println ("i greater than j:"  +(i>j));
        System.out.println ("i lesser than and equal to j" +(i<=j));
        System.out.println ("i greater than and equal to j" +(i>=j));
        System.out.println ("i equal to j" +(i==j));
        System.out.println ("i not equal to j" +(i!=j));

        System.out.println("Logical");
        System.out.println ("i>j And i>0 :" +((i>j) && (i>0)));
        System.out.println ("i>j or i>0 :" +((i>j) || (i>0)));
        System.out.println ("Not :" +(!true));
        
        System.out.println("Bitwise");
        System.out.println ("i Bitwise & j:" +(i&j));
        System.out.println ("i Bitwise | j:" +(i|j));
        System.out.println ("left shift :" +(i<<1));
        System.out.println ("Right shift :" +(i>>1));

        System.out.println("Assignment");
        System.out.println("Addition Assignment =" + (i+=j));
        System.out.println( "Difference Assignment ="+ (i-=j));
        System.out.println("Product Assignment =" +(i*=j));
        System.out.println("Quotient Assignment =" +(i/=j));
        System.out.println("Remainder Assignment ="+(i%=j));
        System.out.println (" & Assignment  :" +(i&=j));
        System.out.println ("| Assignment:" +(i|=j));
        System.out.println ("left shift Assignment :" +(i<<=1));
        System.out.println ("Right shift Assignment :" +(i>>=1));

        System.out.println("Unary");
        int m = 4;
        m ++;
        int n = m+6 ;
        System.out.println ("Post Increment :" +n);
        int o =4;
        o --;
        int p = o+6 ;
        System.out.println ("Post decrement :" +n);
        int v=4;
        ++v;
        int u = v+6 ;
        System.out.println ("Pre Increment :" +n);
        int d=4;
        --d;
        int e = d+6 ;
        System.out.println ("pre decrement :" +n);    

        System.out.println("Ternary");
        int a =20;
        boolean s =(a>15) ? true : false;
        System.out.println("Ternary :"+s);                           
    
    }
}





