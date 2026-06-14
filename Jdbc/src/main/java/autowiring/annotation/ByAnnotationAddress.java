package autowiring.annotation;

public class ByAnnotationAddress {
	private String street;
	private String city_Name;
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity_Name() {
		return city_Name;
	}
	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}
	
	public ByAnnotationAddress() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ByAnnotationAddress(String street, String city_Name) {
		super();
		this.street = street;
		this.city_Name = city_Name;
	}
	
	@Override
	public String toString() {
		return "ByAnnotationAddress [street=" + street + ", city_Name=" + city_Name + "]";
	}
	
	
}
