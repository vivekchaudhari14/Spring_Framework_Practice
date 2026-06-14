package stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionValueTest {

	public static void main(String[] args) {
		ApplicationContext context = new  ClassPathXmlApplicationContext("stereotype/CollectionConfi.xml");
		CollectionValue ct = context.getBean(CollectionValue.class);
		System.out.println(ct);
	}

}
