package SpringFramework.SpringPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectCollectionTypesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringFramework/SpringPractice/CollectionConfi.xml");
		InjectCollectionTypes ic = (InjectCollectionTypes) context.getBean("collection");
		System.out.println(ic);
	}

}
