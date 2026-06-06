package SpringFramework.SpringPractice;

public class InjectionRefe {
	private String name;
	private String surName;
	private AddressInjectionRefe address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public AddressInjectionRefe getAddress() {
		return address;
	}
	public void setAddress(AddressInjectionRefe address) {
		this.address = address;
	}
	public InjectionRefe(String name, String surName, AddressInjectionRefe address) {
		super();
		this.name = name;
		this.surName = surName;
		this.address = address;
	}
	public InjectionRefe() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "InjectionRefe [name=" + name + ", surName=" + surName + ", address=" + address + "]";
	}
	
	
}
