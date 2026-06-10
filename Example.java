//Sum of prime digits in given number

/*import java.util.Scanner;
public class Example{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;   
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                sum = sum + digit;
            }
            num = num / 10;   
        }
        System.out.println("Sum of prime digits: " + sum);
    }
}*/


//Merge two 1D arrays

/*public class Example {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] merged = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++)
            merged[i] = arr1[i];
        for (int i = 0; i < arr2.length; i++)
            merged[arr1.length + i] = arr2[i];
        System.out.print("Merged Array: ");
        for (int val : merged)
            System.out.print(val + " ");
    }
}
*/

//row with maximum sum in a 2D array

/*public class Example {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int maxSum = 0;
        int rowIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum = sum + arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }
        System.out.println("Row with maximum sum: " + rowIndex);
        System.out.println("Maximum sum: " + maxSum);
    }
}*/

//Word count

/*import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        System.out.println("Number of words: " + (count + 1));
    }
}*/

//Reverse words in the sentence

/*import java.util.Scanner;
public class Example{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }

        System.out.println("Reversed sentence: " + result.toString());
    }
}*/


