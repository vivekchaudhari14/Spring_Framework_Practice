package autowiring;

public class AutoWiringByType {
	
	private AutoWiringByType2 address;

	public AutoWiringByType2 getAddress() {
		return address;
	}

	public void setAddress(AutoWiringByType2 address) {
		this.address = address;
	}

	public AutoWiringByType(AutoWiringByType2 address) {
		super();
		this.address = address;
	}

	public AutoWiringByType() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AutoWiringByType [address=" + address + "]";
	}

	
	
	
}
