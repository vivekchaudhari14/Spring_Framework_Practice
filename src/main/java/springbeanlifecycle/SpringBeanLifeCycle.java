package springbeanlifecycle;

public class SpringBeanLifeCycle {
	private String product;
	private int price;
	
	public SpringBeanLifeCycle(String product, int price) {
		super();
		this.product = product;
		this.price = price;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		System.out.println("Data Assining");
		this.product = product;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public SpringBeanLifeCycle() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "SpringBeanLifeCycle [product=" + product + ", price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Working Init Method");
	}
	
	public void destroy() {
		System.out.print("Working Destroy Method");
	}
}
