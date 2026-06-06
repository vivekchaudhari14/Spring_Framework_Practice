package autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingQualifierTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/annotation/UsingQualifier.xml");
		UsingQualifier uq = context.getBean("UsingQualifier",UsingQualifier.class);
		System.out.println(uq);
	}
}
