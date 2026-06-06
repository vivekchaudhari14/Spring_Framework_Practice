package javaConfig;

import org.springframework.stereotype.Component;


public class Student {
	
	private Teacher teacher;
	
	
	
	public Student(Teacher teacher) {
		super();
		this.teacher = teacher;
	}



	public void study() {
		this.teacher.teaching();
		System.out.println("Student is studies Now");
	}
}
