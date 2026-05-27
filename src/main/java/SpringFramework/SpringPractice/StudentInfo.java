package SpringFramework.SpringPractice;

public class StudentInfo {
	
	private String s_name;
	private String s_class;
	private String Addreses;
	
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_class() {
		return s_class;
	}
	public void setS_class(String s_class) {
		this.s_class = s_class;
	}
	public String getAddreses() {
		return Addreses;
	}
	public void setAddreses(String addreses) {
		Addreses = addreses;
	}
	public StudentInfo(String s_name, String s_class, String addreses) {
		super();
		this.s_name = s_name;
		this.s_class = s_class;
		Addreses = addreses;
	}
	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "StudentInfo [s_name=" + s_name + ", s_class=" + s_class + ", Addreses=" + Addreses + "]";
	}
	
	
	
}
