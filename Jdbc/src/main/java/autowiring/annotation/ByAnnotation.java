package autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class ByAnnotation {
	
	@Autowired
	private ByAnnotationAddress address;

	public ByAnnotationAddress getAddress() {
		return address;
	}

	public void setAddress(ByAnnotationAddress address) {
		this.address = address;
	}

	public ByAnnotation(ByAnnotationAddress address) {
		super();
		this.address = address;
	}

	public ByAnnotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ByAnnotation [address=" + address + "]";
	}
	
	
	
}
