package WebDriver_examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_reader_Ex {

	public static void main(String[] args) throws Exception {
		FileReader file=new FileReader("C:\\Users\\dell\\Desktop\\Batches.txt");
		
		BufferedReader reader=new BufferedReader(file);
		
		String line;
		
		while((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		
		file.close();
		
		

	}

}
