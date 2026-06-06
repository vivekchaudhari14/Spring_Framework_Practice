package autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UsingQualifier {
	
	@Autowired
	@Qualifier("address2")
	private UsingQualifier_Class_Info address;

	public UsingQualifier_Class_Info getAddress() {
		return address;
	}

	public void setAddress(UsingQualifier_Class_Info address) {
		this.address = address;
	}

	public UsingQualifier(UsingQualifier_Class_Info address) {
		super();
		this.address = address;
	}

	public UsingQualifier() {
		super();
	}

	@Override
	public String toString() {
		return "UsingQualifier [address=" + address + "]";
	}
	
	
}
