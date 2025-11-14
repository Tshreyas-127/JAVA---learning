import java.lang.reflect.Field;

import java.lang.reflect.Method;

import java.lang.reflect.Modifier;



public class Demo {



	public static void main(String[] args) {



		Project p = new Project();



		Class c = p.getClass();

		System.out.println(c);



		System.out.println(c.getName());



		Method[] m = c.getMethods();

		for (Method m1 : m) {

			System.out.print(m1.getName() + " ");

		}



		String name = "Mumbai";

		Class cStr = name.getClass();



		Field[] f = cStr.getDeclaredFields();

		for (Field f1 : f) {

			System.out.println(f1.getName() + "\t\t\t\t" + Modifier.toString(f1.getModifiers()));

		}



		System.out.println(

				"===================================================================================================");



		Method[] ms = cStr.getDeclaredMethods();

		for (Method m1 : ms) {

			System.out.println(Modifier.toString(m1.getModifiers()) + " " + m1.getReturnType() + " " + m1.getName());

		}



		System.out.println(

				"===================================================================================================");



	}

}