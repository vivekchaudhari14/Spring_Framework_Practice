package autowiring;

public class AutoWiringByType2 {
	private String street;
	private String city;
	
	@Override
	public String toString() {
		return "AutoWiringByType2 [street=" + street + ", city=" + city + "]";
	}
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
