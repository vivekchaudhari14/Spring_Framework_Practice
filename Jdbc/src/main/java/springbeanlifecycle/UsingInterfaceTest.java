package springbeanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsingInterfaceTest {

	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("springbeanlifecycle/UsingInterface.xml");
		UsingInterface ui = (UsingInterface) context.getBean("UsingInterface");
		System.out.println(ui);
		context.registerShutdownHook();
	}

}
