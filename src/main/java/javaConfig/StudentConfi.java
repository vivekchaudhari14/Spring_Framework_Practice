package javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "javaConfig")
public class StudentConfi {
	
	@Bean
	public Student getStudent() {
		return new Student(getTeacher());
	}
	
	@Bean
	public Teacher getTeacher() {
		
		return new Teacher();
	}
	
}
