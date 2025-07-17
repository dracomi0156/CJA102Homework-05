package classTest;

public class Cube {
	private double length;
	
	public Cube() {}
	
	public Cube(double length) throws CubeException {
		setLength(length);
	}
	
	public double getLength() {
		return this.length;
	}

	public void setLength(double length) throws CubeException {
		if(length > 0)
			this.length = length;
		else if(length == 0)
			throw new CubeException("不能等於0");
		else
			throw new CubeException("不能小於0");
	}
	
	public double getVolume() {
		return Math.pow(length, 3);
	}
	
}