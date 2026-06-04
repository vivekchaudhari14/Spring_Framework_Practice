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
		
//		LiteralExp l = context.getBean(LiteralExp.class);
//		System.out.println(l.getstr());
		
//		RelationalOp rp = context.getBean(RelationalOp.class);
//		System.out.println(rp.getResult());
//		
//		LogicalOp ro = context.getBean(LogicalOp.class);
//		System.out.println(ro.getRes());
		
//		AccesingBean ab = context.getBean(AccesingBean.class);
//		System.out.println(ab.Details());
		
//		MethodCalling mc = context.getBean(MethodCalling.class);
//		System.out.println(mc.getMessage());
		
		Ternary t = context.getBean(Ternary.class);
		System.out.println(t.getResult());
	}

}
