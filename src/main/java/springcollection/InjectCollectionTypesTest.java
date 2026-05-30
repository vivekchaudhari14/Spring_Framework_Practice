package springcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InjectCollectionTypesTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springcollection/CollectionConfi.xml");
		InjectCollectionTypes ic = (InjectCollectionTypes) context.getBean("collection");
		System.out.println(ic);
		System.out.println(ic.getRoll_Number().getClass().getName());
	}

}
