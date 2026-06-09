package Files;
import java.io.*;
import java.util.Scanner;
public class Filereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// read Line by line using SCANNER
		
		
		  File f = new File("D:\\KGWorkspace\\FileHandling\\src\\Files\\MyFirstFile.txt"); 
		  Scanner read = new Scanner(f); 
		  while(read.hasNextLine()) {
			  System.out.println(read.nextLine());
			}
		  
		  read.close();
		   
		  
		
		
		//Read Character by character
		
		FileReader reader = new FileReader("D:\\KGWorkspace\\FileHandling\\src\\Files\\MyFirstFile.txt");
		int ch; // ASCII Value
		 while((ch=reader.read())!= -1) {
			 System.out.println((char)ch);
		 } 
		 reader.close();
		
		 
		 //Read line by line using BUFFERREADER
		 
		 BufferedReader br = new BufferedReader(new FileReader("D:\\KGWorkspace\\FileHandling\\src\\Files\\MyFirstFile.txt"));
		 String line;
		 
		 while((line = br.readLine())!= null) {
			 System.out.println(line);
		 }
		 
		 br.close();
		 
		 
		 // read word by word
		 BufferedReader br2 = new BufferedReader(new FileReader("D:\\KGWorkspace\\FileHandling\\src\\Files\\MyFirstFile.txt"));
		 String line1;

	        while((line1 = br2.readLine()) != null) {

	            String[] words = line1.split(" ");

	            for(String word : words) {
	                System.out.println(word);
	            }
	        }
	        
	        br2.close();
	}

}
