package classTest;

public class CubeTest{
	public static void main(String[] args) {
		
		try {
			Cube c1 = new Cube(3);
			Cube c2 = new Cube(0);
			Cube c3 = new Cube(-5);
			
		} catch(CubeException e) {
//			e.printStackTrace();
//			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
		
	}
}
