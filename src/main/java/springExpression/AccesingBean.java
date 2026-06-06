package springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AccesingBean {
	
	@Value("#{accesingBeanEmp.name}")
	private String name;
	
	public String Details() {
		return name;
	}

}
