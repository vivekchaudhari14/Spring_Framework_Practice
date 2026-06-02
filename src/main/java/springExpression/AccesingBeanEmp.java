package springExpression;


import org.springframework.stereotype.Component;

@Component
public class AccesingBeanEmp {

private String name = "Vivek";
	
	public String getName() {
		return name;
	}
}
