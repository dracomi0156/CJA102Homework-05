package hw_ext_1_1;

public class InkBrush extends Pen {

	public InkBrush() {
	}

	public InkBrush(String brand, float price) {
		super(brand, price);
	}

	public float getPrice() {
		return super.getPrice() * 0.9f;
	}

	// 實作父類別Pen的抽象方法write()
	public void write() {
		System.out.println("沾墨汁再寫");
	}
}
