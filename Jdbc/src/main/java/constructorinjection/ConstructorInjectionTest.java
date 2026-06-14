package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructorinjection/ConstructorInjection.xml");
		ConstructorInjection ci = (ConstructorInjection) context.getBean("ConstructorInjection");
		System.out.println(ci);
	}
}
