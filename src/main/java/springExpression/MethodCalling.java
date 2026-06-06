package springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MethodCalling {
	@Value("#{methodCalling2.greet()}")
	private String message;
	
	public String getMessage() {
		return message;
	}
}
