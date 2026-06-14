package SpringFramework.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectionRefeTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringFramework/SpringPractice/InjectionRefe.xml");
		InjectionRefe ir = (InjectionRefe) context.getBean("class1");
		System.out.println(ir);
		System.out.println(ir.getName().getClass().getName());
	}
}
