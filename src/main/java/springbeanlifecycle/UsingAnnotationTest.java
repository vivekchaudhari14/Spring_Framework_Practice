package springbeanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingAnnotationTest {
	public static void main(String[] args) {
			
			AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbeanlifecycle/UsingAnnotation.xml");
			UsingAnnotation ua = (UsingAnnotation) context.getBean("UsingAnnotation");
			System.out.println(ua);
			context.registerShutdownHook();
		 
	}
}
