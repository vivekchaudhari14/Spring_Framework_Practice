package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringByTypeTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("autowiring/AutoWiringByType.xml");
		AutoWiringByType byType = context.getBean("AutoWiringByType" , AutoWiringByType.class);
		System.out.println(byType);

	}

}
