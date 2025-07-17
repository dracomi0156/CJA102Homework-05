package classTest;

public class Cube2 {
	private double length;
	
	public Cube2() {
		
	}
	
	public Cube2(double length) throws CubeException2 {
		setLength(length);
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) throws CubeException2 {
		if (length > 0)
			this.length = length;
		else
			throw new CubeException2("正立方體邊長不得為0或是負數");
	}
	
	public double getVolume() {
		return Math.pow(length, 3);
	}
	
}
