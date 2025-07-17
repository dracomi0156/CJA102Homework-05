package classTest;

public class CubeTest2 {
	
	public static void main(String[] args) {
		try {
//			Cube c1 = new Cube(0);
//			System.out.println(c1.getVolume());
			
			Cube2 c2 = new Cube2();
			c2.setLength(5);
			System.out.println(c2.getVolume());
		} catch (CubeException2 e) {
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
