package autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ByAnnotationTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/annotation/ByAnnotation.xml");
		ByAnnotation ba = context.getBean("ByAnnotation" , ByAnnotation.class);
		System.out.println(ba);
	}

}
