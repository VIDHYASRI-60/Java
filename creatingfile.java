package Files;
import java.io.*;
public class creatingfile {

	public static void main(String[] args )throws IOException{
		// TODO Auto-generated method stub
		
		    
		            File f = new File("C:\\Users\\User\\Desktop\\JAVA\\Filehandling\\src\\Files\\Sample.txt");
		            if (f.createNewFile()) {
		                System.out.println("File Created");
		            } else {
		                System.out.println("File Already Exists");
		                System.out.println(f.exists());
		                System.out.println(f.getName());
		            }

	}}
		

