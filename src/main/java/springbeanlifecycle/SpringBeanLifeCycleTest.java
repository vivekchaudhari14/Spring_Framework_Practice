package springbeanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanLifeCycleTest {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new 
				ClassPathXmlApplicationContext("springbeanlifecycle/SpringBeanLifeCycle.xml");
		
		SpringBeanLifeCycle sl = (SpringBeanLifeCycle) context.getBean("SpringBeanLifeCycle");
		System.err.println(sl);
		context.registerShutdownHook();
	}
}
