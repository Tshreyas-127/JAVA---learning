package org.ycpait.DemoFileIO;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class DemoFileRead {

	public static void main(String[] args) {
		
		FileInputStream fis  = null;
		
		try {
			fis = new FileInputStream("readme.txt");
			System.out.println("File found");
			
			int data = fis.read();

			while(data != -1) {
				System.out.print((char)data);
				data = fis.read();
			};
			fis.close();
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();	
		}
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}



