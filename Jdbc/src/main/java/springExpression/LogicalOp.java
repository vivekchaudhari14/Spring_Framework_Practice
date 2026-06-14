package springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LogicalOp {
	@Value("#{true or false}")
	private boolean res;
	
	public boolean getRes() {
		return res;
	}
}
