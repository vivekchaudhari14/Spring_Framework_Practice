package autowiring.annotation;

public class UsingQualifier_Class_Info {
	
	private String street;
	private String city_Name;
	
	public UsingQualifier_Class_Info() {
		super();
	}
	public UsingQualifier_Class_Info(String street, String city_Name) {
		super();
		this.street = street;
		this.city_Name = city_Name;
	}
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
	@Override
	public String toString() {
		return "UsingQualifier_Class_Info [street=" + street + ", city_Name=" + city_Name + "]";
	}
	
	
}
