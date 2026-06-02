package springExpression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LiteralExp {
	@Value("#{'Hello Spring'}")
	private String str;
	
	public String getstr() {
		return str;
	}
}
