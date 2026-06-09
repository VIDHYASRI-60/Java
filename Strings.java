/*import java.util.Scanner;
public class Strings{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.print(str);
    }
}*/


//Concatination

/*import java.util.Scanner;
public class Strings{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("String 1 : ");
        String s1=sc.next();
        System.out.print("String 2 :");
        String s2=sc.next();
        System.out.println(s1 + s2);
    }
}*/


//next nextLine

/*import java.util.Scanner;
public class Strings{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("String 1 : ");
        String s1=sc.next();           // when we are using next ...dont forget to use "sc.nextLine();" in next line 
        sc.nextLine();
        System.out.print("String 2 :");
        String s2=sc.nextLine();
        System.out.print(s1);
        System.out.print(s2);
    }
}*/

//Palindrome

/*import java.util.Scanner;
public class Strings{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("String : ");
        String str=sc.next();  
        String rev="";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {                 // in string ,we use ".equals()" for checking
            System.out.println("Palindrome");
        } else { 
            System.out.println("Not a Palindrome");
        }

    }
}*/

//Builtin Functions

/*import java.lang.String;
public class Strings{
    public static void main(String[] args){
        String s1= "Java Programming";
        String s2="java programming";
        String s3="  Learn Java  ";
        System.out.println("Length  :" +s1.length());    //Returns the total number of characters in the string.
        System.out.println("Equals  :" +s1.equals(s2));    //Compares two strings for exact equality (case-sensitive)
        System.out.println("char at index 5 :" +s1.charAt(5));  //Returns the character at the specified index.
        System.out.println("Equals ignore case :" +s1.equalsIgnoreCase(s2)); //Compares two strings by ignoring case differences.
        System.out.println("compare  :" +s1.compareTo(s2));           //gives difference of ascii value
        System.out.println("Uppercase  :" +s1.toUpperCase());         //Converts all characters in the string to uppercase.
        System.out.println("Lowercase  :" +s1.toLowerCase());         //Converts all characters in the string to lowercase.
        System.out.println("Substring (0,6) :" +s1.substring(0,7));     //Returns a part of the string from begin index to end index (excluding end).
        System.out.println("Substring (5) :" +s1.substring(5));         //Returns a substring starting from the given index to the end.
        System.out.println("Contains 'Java': " + s1.contains("ajva"));   //Checks whether the string contains the specified sequence.
        System.out.println("Starts with Java: " + s1.startsWith("Java"));   //Checks if the string starts with the given prefix.
        System.out.println("Ends with ing: " + s1.endsWith("ing"));       //Checks if the string ends with the given suffix.
        System.out.println("Index of 'a': " + s1.indexOf('a'));          //Returns the index of the first occurrence of the character.
        System.out.println("Last index of 'a': " + s1.lastIndexOf('a'));    //Returns the index of the last occurrence of the character.
        System.out.println("Replace Java with Python: " + s1.replace("Java", "Python")); //Replaces all occurrences of one substring with another.
        System.out.println("Remove spaces: " + s1.replaceAll("\\s", ""));        //Replaces all substrings that match a regular expression.
        System.out.println("Trimmed string:" + s3.trim() + "");       //Removes Starting and end spaces from the string.
        String emptyStr = "";
        System.out.println("Is empty: " + emptyStr.isEmpty());         //Checks whether the string is empty or not.
        
        String langs = "Java,Python,C++,JavaScript";
        String[] arr = langs.split(",");                  //Splits the string into an array using the given delimiter.
        System.out.println("Split result:");
        for (String lang : arr) {
            System.out.println(lang);
        }
        
        System.out.println("Concat: " + "Hello".concat(" World"));   //Appends the given string to the end of another string.
        
        int num = 10;
        String numStr = String.valueOf(num);              //Converts data types like int, float, etc., into a string.
        System.out.println("ValueOf int: " + numStr);
        
        char[] chars = s1.toCharArray();                 //Converts the string into a character array.
        System.out.println("Characters:");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        
        // System.out.println("\n Repeat: " + "Hi".repeat(3));  // Repeats the string the specified number of times.(Java version issue)
    }
}*/


//Vowels count 

/*public class Strings {
    public static void main(String[] args) {

        String str = "Interview";
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' ||
                ch == 'O' || ch == 'U') {
                vowels++;
            }
        }

        System.out.println("Vowels count: " + vowels);
    }
}*/

//Anagram

/*import java.util.Arrays;
public class Stringdemo {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";
        if (s1.length() != s2.length()) {       //
            System.out.println("Not Anagram");
            return;
        }
        char[] a = s1.toCharArray();        // convert character into array
        char[] b = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}*/
    
//Remove duplicates

/*public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "programming";
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (result.indexOf(ch) == -1) {       // if the char is not already present 
                result = result + ch;
            }
        }
        System.out.println(result);
    }
}*/


//pangram

/*public class Strings {
    public static void main(String[] args) {

        String str = "The quick brown fox jumps over the lazy dog";
        str = str.toLowerCase();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1) {
                System.out.println("Not Pangram");
                return;
            }
        }
        System.out.println("Pangram");
    }
}*/


// String Buffer ....builtin 

/*public class Strings{
	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Java programming");
		System.out.println("Length: "+ s.length());
		s.append("!!!");                            //Adds text at the end of the existing string.
		System.out.println("Modified String: "+s);
		s.insert(5,"Hello ");                       //Inserts the given string starting at index 5.
		System.out.println("Insert: "+s);
		s.replace(11, 22, "code");                  //Replaces characters from index 11 to 21 with "code"
		System.out.println("Replace :"+s);
		s.delete(5, 11);                            //Deletes characters from index 5 to 10.
		System.out.println("Delete: "+s);
		s.reverse();                                //Reverses the entire string.
		System.out.println("Reeverse: " +s);
		System.out.println("Capacity: "+ s.capacity()); //(Default capacity = length + 16)
		System.out.println("Char at: "+ s.charAt(4));   //Returns the character at index 4.
		s.setCharAt(4, 'e');                         //Replaces the character at index 4 with 'e'.
		System.out.println("Set character: "+ s);
		System.out.println("Substring: " + s.substring(5)); //Returns a substring from index 5 to the end
		String c=s.toString();                          //Converts StringBuffer into a String object.
		System.out.println("Converted to String: "+c);
		
	}
}*/


//String Builder 

/*public class Strings {
    public static void main(String[] args) {
        String s1="Java";
        StringBuilder sb = new StringBuilder(s1);
        System.out.println("Initial value: " + sb);
        sb.append(" Programming");
        System.out.println("After append(): " + sb);
        sb.insert(4, " Language");
        System.out.println("After insert(): " + sb);
        sb.replace(0, 4, "Core");
        System.out.println("After replace(): " + sb);
        sb.delete(4, 13);
        System.out.println("After delete(): " + sb);
        sb.deleteCharAt(4);
        System.out.println("After deleteCharAt(): " + sb);
        sb.reverse();
        System.out.println("After reverse(): " + sb);
        sb.reverse();
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Character at index 1: " + sb.charAt(1));
        sb.setCharAt(0, 'L');
        System.out.println("After setCharAt(): " + sb);
        System.out.println("Substring (0 to 4): " + sb.substring(0, 4));
        System.out.println("Index of 'gram': " + sb.indexOf("gram"));
        System.out.println("Last index of 'a': " + sb.lastIndexOf("a"));
        sb.setLength(4);
        System.out.println("After setLength(): " + sb);
        sb.ensureCapacity(50);
        System.out.println("After ensureCapacity(): " + sb.capacity());
        String normalString = sb.toString();
        System.out.println("Converted to String: " + normalString);
    }
}*/

/*public class Strings {
    public static void main(String[] args) {
        String s1="Javaprogram";
       
        System.out.print(s1);
        System.out.println("Substring (0 to 4): " + s1.substring(1, 2));
    }
}*/


public class Strings {
    public static void main(String[] args) {
        String str = "Education";
        str=str.toLowerCase();
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                vowels++;
            }
        }
        System.out.println("Vowels count: " + vowels);
    }
}