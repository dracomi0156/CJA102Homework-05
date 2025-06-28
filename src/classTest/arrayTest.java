package classTest;

public class arrayTest {
	public static void main(String[] args) {
		int[][] x = new int[3][3];
		int[][] y = new int[3][3];
		int[][] z = new int[3][3];
		
		setArrayRandom(x);
		setArrayRandom(y);	

		for(int i=0; i<x.length; i++) {
			for(int j=0; j<y.length; j++) {
				z[i][j] = x[i][j] + y[i][j];
				System.out.print(z[i][j]+" ");
			}
			System.out.println();
		}
		
//		(int)(Math.random()*30)+1; //1~30
//		(int)(Math.random()*31); //0~30
		
//		System.out.println(Math.random()); // 0 <= r < 1
	}
	
	public static void setArrayRandom(int[][] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = (int)(Math.random()*31);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void sumArrayRandom(int[][] arr1, int[][] arr2) {
		int[][] arr = new int[arr1.length][];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
//				return arr1[i][j] + arr2[i][j];
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	
}

