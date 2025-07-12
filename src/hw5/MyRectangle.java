package hw5;

public class MyRectangle{
	private double width;
	private double depth;
	
	public MyRectangle() {};

	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}

	void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		}
	}

	void setDepth(double depth) {
		if (depth > 0) {
			this.depth = depth;
		}
	}

	double getArea() {
		return this.width * this.depth;
	}

}
