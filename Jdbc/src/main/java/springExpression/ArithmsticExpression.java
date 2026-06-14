package springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ArithmsticExpression {
	@Value("#{10+20}")
	private int marks;
	
	public int getMarks() {
		return marks;
	}
	
}
