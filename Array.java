/*public class Array{
    public static void main(String []args){
        int[] arr ={98,97,96};
        int n = arr.length;  // array_name.length -to get lenth of an array
        for(int i=0;i<n ; i++){
            System.out.println(arr[i]);

        }
    }
}*/


// USER INPUT 
/*import java.util.Scanner;
public class Array{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        sc.close();
    }
}*/


//SUM  OF ELEMENTS IN ARRAY


/*import java.util.Scanner;
public class Array{
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int sum =0;
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            sum = sum+ a[i];
        }
        System.out.print(sum);
    }
}*/


 //odd elements
/*
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 != 0) {
                System.out.println(a[i]);
            }
        }
    }
}*/

//Average of numbers in array

/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int sum=0;
        double m=0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0 ; i<n ;i++){
            sum = sum+ a[i];
            m = (double) sum/n ; 
        }
        System.out.print(m); 
        
    }
}*/


//Elements in odd index

/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
         for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<n;i++){
            if( i%2 != 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}*/


//Index of an element

/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
         for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter an element:");
        int element = sc.nextInt();
        for(int i =0 ;i<n ;i++){
            if(element == a[i]){
                System.out.print(i);
            }
        }
    }
}*/
        

//Elements of the array in reverse order

/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}*/


//count the number of odd and even elements in an array

/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                evenCount = evenCount + 1;
            } else {
                oddCount = oddCount + 1;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}*/


//Largest in array

/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int largest = arr[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > largest) {
            largest = a[i];
        }
    }

    System.out.println("Largest element: " + largest);
    }}*/

//Smallest element in array

/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int smallest = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] < smallest) {
            smallest = a[i];
        }
    }

    System.out.println("Smallest element:" +smallest);
    }}*/


//Second smallest

/*import java.util.Scanner;
public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int smallest, secondSmallest;

        if (a[0] < a[1]) {
            smallest = a[0];
            secondSmallest = a[1];
        } else {
            smallest = a[1];
            secondSmallest = a[0];
        }

        for (int i = 2; i < n; i++) {
            if (a[i] < smallest) {
                secondSmallest = smallest;
                smallest = a[i];
            } else if (a[i] < secondSmallest && a[i] != smallest) {
                secondSmallest = a[i];
            }
        }

        System.out.println("Second smallest element: " + secondSmallest);
    }
}*/

//Second largest

/*import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest, secondLargest;

        if (a[0] > a[1]) {
            largest = a[0];
            secondLargest = a[1];
        } else {
            largest = a[1];
            secondLargest = a[0];
        }

        for (int i = 2; i < n; i++) {
            if (a[i] > largest) {
                secondLargest = largest;
                largest = a[i];
            } else if (a[i] > secondLargest && a[i] != largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}*/

// Ascending order

/*import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}*/

//Desending order

/*import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        System.out.println("Descending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}*/


//Arrays using inbuilt functions

/*import java.util.Arrays;
public class Array{
    public static void main(String [] args){
        int[] a= new int[]{2,1};
        Arrays.sort(a);
        for(int i:a)
        System.out.print(i+ " ");
        System.out.println();
        int [] b=new int[]{1,2};
        System.out.println(Arrays.equals(a,b));
        Arrays.fill(a,2);
        for(int i:a)
        System.out.print(i+ " ");
        System.out.println();
        int[] cpy=Arrays.copyOf(a,3);
        for(int i:cpy)
        System.out.print(i+ " ");
        System.out.println();
        System.out.println(Arrays.toString(b));
        
    }
}*/


