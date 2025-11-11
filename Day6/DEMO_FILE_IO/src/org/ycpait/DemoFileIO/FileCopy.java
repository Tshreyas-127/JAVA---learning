package org.ycpait.DemoFileIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("readme.txt");
			System.out.println("File is Created");
			fos = new FileOutputStream("creadme.txt");
			int data = fis.read();
			while (data != -1) {
				fos.write(data);
				data = fis.read();
			}
			
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
