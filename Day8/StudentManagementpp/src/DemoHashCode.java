import java.util.HashSet;
import java.util.Set;

import org.yacpait.StudentManagementapp.entity.Student;

public class DemoHashCode {

	public static void main(String[] args) {
		
		Set<Student> students= new HashSet<Student>();
		
		Student s1 = new Student("Shreyas",88);
		Student s2 = new Student("Shreyas",98);
		
		students.add(s1);
		students.add(s2);
		
		System.out.println(students.size());
		System.out.println(students);
//		System.out.println(students.hashCode());

		
	}

}
