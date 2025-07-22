package hw_ext_1_1;

public class Pencil extends Pen {

	public Pencil() {
	}

	public Pencil(String brand, float price) {
		super(brand, price);
	}

	public float getPrice() {
		return super.getPrice() * 0.8f;
	}

	// 實作父類別Pen的抽象方法write()
	public void write() {
		System.out.println("削鉛筆再寫");
	}
}
