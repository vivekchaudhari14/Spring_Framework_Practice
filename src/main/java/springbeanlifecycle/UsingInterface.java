package springbeanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class UsingInterface implements InitializingBean , DisposableBean{
	private String name;
	private String  class_Name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClass_Name() {
		return class_Name;
	}
	public void setClass_Name(String class_Name) {
		this.class_Name = class_Name;
	}
	public UsingInterface() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "UsingInterface [name=" + name + ", class_Name=" + class_Name + "]";
	}
	@Override
	public void destroy() throws Exception {
		System.out.println(" Destroy Working");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init Working");
	}
	
	
}
