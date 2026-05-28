package springbeanlifecycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class UsingAnnotation {
	private String addreses;
	private String near_city;
	
	public UsingAnnotation() {
		super();
		
	}
	public String getAddreses() {
		return addreses;
	}
	public void setAddreses(String addreses) {
		this.addreses = addreses;
	}
	public String getNear_city() {
		return near_city;
	}
	public void setNear_city(String near_city) {
		this.near_city = near_city;
	}
	@Override
	public String toString() {
		return "UsingAnnotation [addreses=" + addreses + ", near_city=" + near_city + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Method is Working");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending here");
	}
	
}
