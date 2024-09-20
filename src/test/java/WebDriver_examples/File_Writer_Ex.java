package WebDriver_examples;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writer_Ex {

	public static void main(String[] args) throws Exception {
		FileWriter file=new FileWriter("C:\\Users\\dell\\Desktop\\nikhil.txt");
		
		file.write("I am Nikhil");
		
		file.write("\n");
		
		file.write("I am Yaswanth");
		
		file.close();

	}

}
