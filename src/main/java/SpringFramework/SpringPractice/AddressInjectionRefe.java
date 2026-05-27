package SpringFramework.SpringPractice;

public class AddressInjectionRefe {
	private String Village;
	private String street;
	private String city;
	
	public String getVillage() {
		return Village;
	}
	public void setVillage(String village) {
		Village = village;
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
	
	public AddressInjectionRefe(String village, String street, String city) {
		super();
		Village = village;
		this.street = street;
		this.city = city;
	}
	public AddressInjectionRefe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [Village=" + Village + ", street=" + street + ", city=" + city + "]";
	}
	
	
}
