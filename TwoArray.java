//2D Array

/*import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int r=sc.nextInt();   //Row
        int c=sc.nextInt();   //Column
        int[] [] a=new int[r][c];
        for(int i=0;i<r ;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }System.out.println();
        }
        for(int i=0;i<r ;i++){
            for(int j=0;j<c;j++){
                System.out.print(a[i][j] +" ");
            }System.out.println();
        }
    }
}*/

//Sum of two array

/*import java.util.Scanner;
public class TwoArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Row  : ");
        int r=sc.nextInt();   //Row
        System.out.print("Column  : ");
        int c=sc.nextInt();   //Column
       
        int[] [] a=new int[r][c];
        int[] [] b=new int[r][c];
        int[] [] sum=new int[r][c];
        System.out.println("Array 1  :");
        for(int i=0;i<r ;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }System.out.println();
        }

        System.out.println("Array 2 :");
        for(int i=0;i<r ;i++){
            for(int j=0;j<c;j++){
                b[i][j]=sc.nextInt();
            }System.out.println();
        }
      
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=a[i][j] + b[i][j];
        }
        }
        System.out.print("Sum of 2 Arrays:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(sum[i][j] + " ");
    }System.out.println();
}}}*/


//Transpose of matrix

/*import java.util.Scanner;
public class TwoArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Row  : ");
        int r=sc.nextInt();   //Row
        System.out.print("Column  : ");
        int c=sc.nextInt();   //Column
       
        int[] [] a=new int[r][c]; //Array
        int[] [] t=new int[c][r]; //Transpose array 

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt(); //getting input from user for array "a"
            }System.out.println();
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                t[j][i]=a[i][j];   //assigning array " a" values to array "t"
            }
        }

        for(int i=0;i<c;i++){     //row "i" should be column
            for(int j=0;j<r;j++){ //column "j" should be row
                System.out.print(t[i][j] + " "); //
            }System.out.println();
        }
    }
}*/

//Sorting ......its not right

/*import java.util.Scanner;
public class TwoArray {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Row  : ");
        int r=sc.nextInt();   //Row
        System.out.print("Column  : ");
        int c=sc.nextInt();   //Column
       
        int[] [] a=new int[r][c];
        for(int i=0 ;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }System.out.println();
        }

        for(int i=0 ;i<r-1;i++){
            for(int j=0;j<c-1;j++){
                if(a[i][j]>a[i+1][j+1]){
                    a[i][j] = a[i+1][j+1];
                }
            }
        }

       for(int i=0;i<r;i++){     
            for(int j=0;j<c;j++){ 
                System.out.print(a[i][j] + " "); 
            }System.out.println();
        }
    }
}*/


//row column sum
/*import java.util.*;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // Row sum
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) sum += a[i][j];
            System.out.println("Row " + i + " sum = " + sum);
        }

        // Column sum
        for (int j = 0; j < c; j++) {
            int sum = 0;
            for (int i = 0; i < r; i++) sum += a[i][j];
            System.out.println("Column " + j + " sum = " + sum);
        }
    }
}*/


//MAX MIN
/*import java.util.*;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int max = a[0][0];
        int min = a[0][0];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (a[i][j] > max) 
                    max = a[i][j];
                if (a[i][j] < min) 
                    min = a[i][j];
            }
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}*/


//Diagonal sum

/*import java.util.*;
public class TwoArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i][i];   
        }

        System.out.println("Diagonal sum = " + sum);
    }
}*/



//Boundary elements

import java.util.*;

public class TwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] a = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Boundary Elements:");

        //  Print Top Row
        for (int j = 0; j < c; j++) {
            System.out.print(a[0][j] + " ");
        }

        //  Print Right Column (excluding top & bottom)
        for (int i = 1; i < r - 1; i++) {
            System.out.print(a[i][c - 1] + " ");
        }

        // Print Bottom Row (only if more than 1 row)
        if (r > 1) {
            for (int j = c - 1; j >= 0; j--) {
                System.out.print(a[r - 1][j] + " ");
            }
        }

        // Print Left Column (excluding top & bottom)
        for (int i = r - 2; i > 0; i--) {
            System.out.print(a[i][0] + " ");
        }
    }
}




