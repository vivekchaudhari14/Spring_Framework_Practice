package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProtoTypeConfiTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("scope/ProtoTypeConfi.xml");
		ProtoTypeConfi p = context.getBean("prototype" ,ProtoTypeConfi.class);
		System.out.println(p.hashCode());
		ProtoTypeConfi p1 = context.getBean("prototype",ProtoTypeConfi.class);
		System.out.println(p1.hashCode());
	}

}
