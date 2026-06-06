package standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("standalonecollection/AloneConfi.xml");
		Person p = context.getBean("frd", Person.class);
		System.out.println(p);
		System.out.println(p.getFriends().getClass().getName());
	}
}
