package springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RelationalOp {
	@Value("#{10>5}")
	private boolean result;
	
	public boolean getResult() {
		return result;
	}
}
