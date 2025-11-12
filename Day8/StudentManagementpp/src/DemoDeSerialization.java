import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.yacpait.StudentManagementapp.entity.Student;

public class DemoDeSerialization {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try 
		{
			fis = new FileInputStream("students.txt");
			ois = new ObjectInputStream(fis);
			
			Student s = (Student)ois.readObject();			
			System.out.println(s);
			
			fos = new FileOutputStream("student.txt");
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(s);
			
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (IOException e) 
		{	
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{	
			e.printStackTrace();
		}
		 
		
		
	}

}
