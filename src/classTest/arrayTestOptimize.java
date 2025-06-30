package classTest;

public class arrayTestOptimize {
	public static void main(String[] args) {
		arrayTestOptimize tra = new arrayTestOptimize();
		int[][] x = tra.getRandomArray();
		int[][] y = tra.getRandomArray();
		int[][] z = new int[3][3];
		
		for (int i = 0; i < z.length; i++) {
			for (int j = 0; j < z[i].length; j++) {
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		
		tra.printArray(x);
		tra.printArray(y);
		tra.printArray(z);
	}


	public int[][] getRandomArray() {
		int[][] arr = new int[3][3];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = (int)(Math.random()*31);
			}
		}
		return arr;
	}
	
	public void printArray(int[][] data) {
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("=====================");
	}
	

}
