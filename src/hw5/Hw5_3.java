package hw5;

public class Hw5_3 {
//	利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳

	public static void main(String[] args) {
		int[][] intArray = { { 5, 10, 15 }, { 3, 9, 35 } };
		double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.4 } };

		Hw5_3 w = new Hw5_3();
		System.out.println(w.maxElement(intArray));
		System.out.println(w.maxElement(doubleArray));
	}

	public int maxElement(int x[][]) {
		int max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

	public double maxElement(double x[][]) {
		double max = x[0][0];
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}

}
