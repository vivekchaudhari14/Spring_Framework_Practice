package stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CollectionValue {
	@Value("#{temp}")
	List<Integer> rollNumber;

	public List<Integer> getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(List<Integer> rollNumber) {
		this.rollNumber = rollNumber;
	}

	@Override
	public String toString() {
		return "CollectionValue [rollNumber=" + rollNumber + "]";
	}
	
	
}
