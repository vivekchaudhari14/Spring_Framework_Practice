package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("stereotype/stereoConfi.xml");
		Person person = context.getBean("person" , Person.class);
		System.out.println(person);
		
	}

}
