

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.yacpait.StudentManagementapp.entity.Student;

public class DemoSerialization {

	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try 
		{
			fos = new FileOutputStream("students.txt");
			oos = new ObjectOutputStream(fos);
			
			
			Student s = new Student("Shreyas", 88.00f);
			oos.writeObject(s);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			
		} 
		catch (IOException e) 
		{	
			e.printStackTrace();
			
		}
		
	}

}
