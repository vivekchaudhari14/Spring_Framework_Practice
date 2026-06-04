package springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ternary {
	@Value("#{10 > 5 ? 'Pass' : 'Fail'}")
	private String result;

	public String getResult() {
		return result;
	}
	
	
}
