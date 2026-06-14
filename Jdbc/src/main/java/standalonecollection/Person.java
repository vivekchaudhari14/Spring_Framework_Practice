package standalonecollection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
	private List<String> friends;
	private Map<String, Integer> feesStr;
	private Set<Integer> roll_number;
	private Properties properties;

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	public Set<Integer> getRoll_number() {
		return roll_number;
	}

	public void setRoll_number(Set<Integer> roll_number) {
		this.roll_number = roll_number;
	}

	public Map<String, Integer> getFeesStr() {
		return feesStr;
	}

	public void setFeesStr(Map<String, Integer> feesStr) {
		this.feesStr = feesStr;
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", feesStr=" + feesStr + ", roll_number=" + roll_number + ", properties="
				+ properties + "]";
	}

	
	
}
