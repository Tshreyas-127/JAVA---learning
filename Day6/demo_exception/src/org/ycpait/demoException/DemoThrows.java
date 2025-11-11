package org.ycpait.demoException;

import java.io.IOException;

public class DemoThrows {

	public static void main(String[] args) {
		
		/*//handling exception
		try {
		throw e;
		}
		catch(IOException ex) {
			System.out.println("");
		}*/
		try {
			readFile();
			
		}
		catch(IOException e) {
			
		}
	}
	
	static void readFile()throws IOException{
		IOException e = new IOException();
		throw e;
		
			
		
		
		
	
	}
}
