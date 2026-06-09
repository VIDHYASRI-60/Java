//Palindrome

/*import java.util.Scanner;
public class Training{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev =0;
        while(temp>0){
            int digit=temp % 10;
            rev =rev*10 + digit;
            temp =temp/10;
        }
        if(n==rev){
            System.out.print("Palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }
}*/


//count of elements in array

/*import java.util.Scanner;

public class Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int count = 1;

            if (arr[i] == -1)
                continue;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1; 
                }
            }
            System.out.println(arr[i] + " - " + count);
        }
    }
}*/


//sum of unique elements

/*import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                sum += arr[i];
            }
        }

        System.out.println(sum);
    }
}*/

//2d array transpose

/*import java.util.*;
public class Training{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read rows and columns
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        // Input the matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Create transpose matrix
        int[][] trans = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                trans[j][i] = arr[i][j];
            }
        }
        // Print transpose
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Median merge

import java.util.*;

public class Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        int[] merged = new int[2 * n];
        int k = 0;

        for (int i = 0; i < n; i++) merged[k++] = a[i];
        for (int i = 0; i < n; i++) merged[k++] = b[i];

        Arrays.sort(merged);

        double median = (merged[n - 1] + merged[n]) / 2.0;

        System.out.println(median);
    }
}

//remove duplicates from string 
import java.util.*;

public class Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}*/


/*import java.util.Scanner;
public class Training{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}*/


/*import java.util.Scanner;
public class Training{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a =");
        int a = sc.nextInt();
        System.out.print("b =");
        int b = sc.nextInt();
        int c = a + b;
        System.out.print("c ="+c);
        System.out.print("\nd =");
        float d = sc.nextFloat();
        float e = c * d;

        System.out.println(e);
    }
}*/

/*public class Training {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }
    }
}*/


/*import java.util.Scanner;
public class Training {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextFloat();
        double area = 3.14 * r * r;

        System.out.println("Area of Circle: " + area);
    }
}*/

import java.util.Scanner;
public class Training{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int balance = 5000;
        System.out.print("Enter ATM PIN: ");
        int pin = sc.nextInt();

        if (pin == 2345) {

            System.out.println("a) Withdraw");
            System.out.println("b) Deposit");
            System.out.println("c) Check Balance");
            System.out.print("Choose an option: ");
            char choice = sc.next().charAt(0);

            switch (choice) {

                case 'a':
                    System.out.print("Enter amount to withdraw: ");
                    int withdraw = sc.nextInt();

                    if (withdraw <= balance) {
                        balance = balance - withdraw;
                        System.out.println("Withdrawal successful");
                        System.out.println("Remaining balance: " + balance);
                    } else {
                        System.out.println("Insufficient balance");
                    }
                    break;

                case 'b':
                    System.out.print("Enter amount to deposit: ");
                    int deposit = sc.nextInt();

                    balance = balance + deposit;
                    System.out.println("Deposit successful");
                    System.out.println("Updated balance: " + balance);
                    break;

                case 'c':
                    System.out.println("Current balance: " + balance);
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } else {
            System.out.println("Invalid PIN");
        }
    }
}

/*import java.util.Scanner;
public class Training{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String day = sc.nextLine().toLowerCase();

        if (day.contains("mon") || day.contains("tue")) {
            System.out.println("Irritating");
        }
        else if (day.contains("wed") || day.contains("thu")) {
            System.out.println("Frustrated");
        }
        else if (day.contains("fri")) {
            System.out.println("Expectation");
        }
        else if (day.contains("sat") || day.contains("sun")) {
            System.out.println("Relaxation");
        }
        else {
            System.out.println("Invalid day");
        }
    }
}*/













