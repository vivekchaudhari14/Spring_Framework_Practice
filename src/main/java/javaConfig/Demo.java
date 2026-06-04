package javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfi.class);
		Student s = context.getBean(Student.class);
			s.study();
	}

}
