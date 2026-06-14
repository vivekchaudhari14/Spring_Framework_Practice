package constructorinjection;

public class ConstructorInjection {
	private String name;
	private String surname;
	private String class_Name;

	public ConstructorInjection(String name, String surname, String class_Name) {
		super();
		this.name = name;
		this.surname = surname;
		this.class_Name = class_Name;
	}

	public ConstructorInjection() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ConstructorInjection [name=" + name + ", surname=" + surname + ", class_Name=" + class_Name + "]";
	}
	
}
