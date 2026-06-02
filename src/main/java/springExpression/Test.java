package springExpression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springExpression/Epel.xml");
	
		// This Arithmatic expression
//		ArithmsticExpression ae = context.getBean(ArithmsticExpression.class);
//		System.out.println(ae.getMarks());
	
		// Using Literal Expression
		
		LiteralExp l = context.getBean(LiteralExp.class);
		System.out.println(l.getstr());
		
	}

}
