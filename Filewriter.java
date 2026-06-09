package Files;
import java.io.*;
public class Filewriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\\\Users\\\\User\\\\Desktop\\\\JAVA\\\\Filehandling\\\\src\\\\Files\\\\Sample.txt");

        fw.write("Hello Java");
        fw.write("\nWelcome to File Handling");

        fw.close();

        System.out.println("Data Written Successfully");

	}

}
