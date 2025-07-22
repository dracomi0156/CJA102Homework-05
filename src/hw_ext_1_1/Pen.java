package hw_ext_1_1;

public abstract class Pen {
	private String brand;
	private float price;
	
	public Pen() {}
	
	public Pen(String brand, float price) {
		setBrand(brand);
		setPrice(price);
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		if(!brand.isEmpty())
			this.brand = brand;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		if(price > 0)
			this.price = price;
	}
	
	public abstract void write();
}
