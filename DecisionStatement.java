/* ODD OR EVEN
import java.util.Scanner;
public class DecisionStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value :");
        int x = sc.nextInt();
        if (x%2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }
    }
}
*/

/* LARGEST
import java.util.Scanner;
public class DecisionStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a  value :");       
        int x = sc.nextInt();
        System.out.print("Enter a  value :");
        int y = sc.nextInt();
        System.out.print("Enter a  value :");
        int z = sc.nextInt();
        if(x>y && x>z){
            System.out.println("X is largest");
        }
        else if(y>z && y>x){
            System.out.println("Y is largest");
        }
        else{
            System.out.println("Z is largest");
        }
    }
}
*/

/* Grade
import java.util.Scanner;
public class DecisionStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  Mark :");
        int x = sc.nextInt();
        if(x>=80){
            System.out.println("Grade A");
        }
        else{
            if(x>=50){
                System.out.println("Grade B");
            }
            else{
                System.out.println("Fail");
            }
        }
    }
}
*/

/*import java.util.Scanner;
public class DecisionStatement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of month :");
        int month = sc.nextInt();
        switch(month){
            case 1 : System.out.println("January");
            break;
            case 2 : System.out.println("February");
            break;
            case 3 : System.out.println("March");
            break;
            case 4 : System.out.println("April");
            break;
            case 5 : System.out.println("May");
            break;
            case 6 : System.out.println("June");
            break;
            case 7 : System.out.println("July");
            break;
            case 8 : System.out.println("August");
            break;
            case 9: System.out.println("Sept");
            break;
            case 10 : System.out.println("October");
            break;
            case 11 : System.out.println("November");
            break;
            case 12 : System.out.println("December");
            break;
            default : System.out.println("Invalid");

        }
    }
}*/

//Electricity Bill
/*import java.util.Scanner;
public class DecisionStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();
        int bill = 0;

        if (units <= 100) {
            bill = units * 1;
        } 
        else if (units <= 200) {
            bill = (100 * 1) + (units - 100) * 2;
        } 
        else if (units <= 300) {
            bill = (100 * 1) + (100 * 2) + (units - 200) * 3;
        } 
        else {
            bill = (100 * 1) + (100 * 2) + (100 * 3) + (units - 300) * 5;
        }

        System.out.println("Electricity Bill =" + bill);
    }
}*/


//Calculator using switch

import java.util.Scanner;

public class DecisionStatement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        String operation = sc.next();

        int result;

        switch (operation) {
            case "+":
                result = a + b;
                System.out.println("Result = " + result);
                break;

            case "-":
                result = a - b;
                System.out.println("Result = " + result);
                break;

            case "*":
                result = a * b;
                System.out.println("Result = " + result);
                break;

            case "/":
                result = a / b;
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid operator");
        }
    }
}
