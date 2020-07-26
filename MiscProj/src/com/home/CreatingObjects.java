package com.home;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CreatingObjects {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException, CloneNotSupportedException {
// Ways to create object in Java

		//1 Using new Keyword
		Student st = new Student();
		st.setName("Madan");
		
		//2 Using new instance method of class
		Student st1 = (Student) Class.forName("com.home.Student").newInstance();
		st1.setName("Mohan");
		
		
		//3 using new instance of constructor
		Constructor<Student> cs = Student.class.getConstructor();		
		Student st2 = cs.newInstance();
		st2.setName("Nautiyal");
		
		//4 using clone method
		Student st3 = (Student) st.clone();
		
		
		System.out.println("Object 1 " + st.getName());
		System.out.println("Object 2 "+ st1.getName());
		System.out.println("Object 3 "+st2.getName());
		System.out.println("Object 4 "+st3.getName());

		
	}

}
