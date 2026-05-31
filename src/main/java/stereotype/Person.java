package stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("Vivek")
	private String personName;
	@Value("Pimpale")
	private String personCity;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonCity() {
		return personCity;
	}
	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personCity=" + personCity + "]";
	}
	
	
	
}
