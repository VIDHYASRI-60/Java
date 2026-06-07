//For loop

/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value :");       
        int n = sc.nextInt();
        long fact =1;
        for (int i=1 ; i<=n ;i++){
            fact *= i ;
        }
        System.out.println(fact);
    }
}*/


// INFINITE LOOP
/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        for( ; ; ){
            System.out.println("Hello");
        }
    }
}*/


//While loop for print even numbers 1 to 10
/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){      
        int i = 1;
        while(i<=10){
            if (i%2 ==0){
                System.out.println("Number is even" +i);
            }
            
            i++;
        }
    }
}*/


//DOWHILE
/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        int n=1;
        do{
            System.out.println(n);
            n++;
        }
        while(n<=10);
    }
}*/

//print even numbers 1 to 10
/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value :");       
        int n = sc.nextInt();
        do{
            if(n%2 == 0){
                System.out.println("Even" +n);
            }n++;
        }
        while(n<=10);
    }
}*/

//Count of digits 
/*public class Loop{
    public static void main(String[] args){
        int n = 9876;
        int c=0;
        while(n!=0){
            n=n/10; // 9876/10 = 987, 987/10= 98 , 98/10=9 , 9/10=0
            c++;    // 1 , 2 ,3, 4...count will be 4
        }
        System.out.println("Count  " +c);
    }
}*/


//Armstrong number
/*import java.util.Scanner;
import java.lang.Math;
public class Loop{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
		int n=sc.nextInt();
		int c=0;
        int n1=n;
		int temp=n;
		int sum=0;
		while(temp!=0) {
			temp/=10;      
			c++;
		}
		while(n>0) {
			int r=n%10;
			sum+=Math.pow(r,c);
			n/=10;
	    }
        if (n1==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println(" Not an Armstrong number");
        } 
        
    
    }}*/


//Multiplication Table
/*import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Multiplication Table of " + num );
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}*/


//Palindrome
/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev*10  + digit;
            temp = temp / 10; 
        }
        
        if (n == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}*/

//Dowhile to print 1 to 100

/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value :");       
        int n = sc.nextInt();
        do{
            if(n%2 != 0){
                System.out.println("ODD " +n);
            }n++;
        }
        while(n<=100);
    }
}*/


//PERFECT NUMBER
/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value :");       
        int n = sc.nextInt();
        int sum=0;
        for( int i =1;i<n; i++){
            if(n%i == 0){
                sum =sum+i;
            }}
    if(sum == n){
        System.out.println("Perfect number");
    }
    else{
        System.out.println("Not perfect number");
    }
    }
}*/

//Buzz number for given number

/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value :");       
        int n = sc.nextInt();
        if ((n%7 ==0 )|| (n%10 ==7)){
            System.out.println("Buzz Number");
        }
        else{
            System.out.println(" NOT a Buzz Number");
        
        }
    }
}*/


//Buzz number between 1 to n
/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value :");       
        int n = sc.nextInt();
        for(int i=1 ; i<=n ;i++){
            if ((i%7 ==0 )|| (i%10 ==7)){
                System.out.println("Buzz number "+i);
            }
        }
    }
}*/


//Prime number
/*import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) { //we can also give i<= num/2
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }
}*/

//Efficient code for Prime number ...1 and 0 not prime number
/*import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i <= num/2; i++) { //because if it is not divisible by the first half..
        //no possibility to be divided by the rest half,this lessens the  umber of iterations
            if (num % i == 0) {
                count++;
            }
        }

        if ((count == 0) && ((num !=0) && (num!=1))) { // 1 and that n number is excluded...so count =0
            System.out.println(num + " is a Prime Number");
        } else {
            System.out.println(num + " is NOT a Prime Number");
        }
    }
}*/


//Fibo number

/*import java.util.Scanner;
public class Loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of values :");       
        int n = sc.nextInt();
        int a=0 , b=1;
        System.out.println("Fibonacci series:");
        for (int i=1;i<=n;i++){
            int c=a+b;
            System.out.print(a+ "  ");
            a=b;
            b=c;
        }
    }
        }*/


//Spy number

/*import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
            
        int sum = 0;
        int product = 1;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if (sum == product) {
            System.out.println(num + " is a Spy Number");
        } else {
            System.out.println(num + " is NOT a Spy Number");
        }
    }
}*/


//Leap year

/*import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap Year");
        else
            System.out.println("Not a Leap Year");
    }
}*/


//Power ofnumber without Math.pow
/*import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base number:");
        int base = sc.nextInt();
        System.out.print("Enter power:");
        int pow = sc.nextInt();
        int result = 1;
        for(int i=1 ; i<=pow;i++){
            result =result*base;
        }
        System.out.println (result);
    }
}*/


//GCD of two numbers
/*import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("GCD = " + gcd);
    }
}*/

//Gcd using temp variable

/*import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        while(b!=0){
            temp =b ;
            b = a%b;
            a=temp;
        }
        System.out.println("GCD:"+a);
    }
}*/

        
//NEON NUMBERS

import java.util.Scanner;
public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          System.out.print("Enter number: ");
        int num = sc.nextInt();

        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum = sum + (square % 10);
            square = square / 10;
        }

        if (sum == num)
            System.out.println("Neon Number");
        else
            System.out.println("Not a Neon Number");
    }
}
