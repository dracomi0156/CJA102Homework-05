package hw2;

public class TestNineNine {
	public static void main(String[] args) {
//		九九乘法表
//		使用for + for
		for (int j = 1; j <= 9; j++) {
			for (int k = 1; k <= 9; k++) {
				System.out.print(k + "*" + j + "=" + k * j + "\t");
			}
			System.out.println();
		}
		System.out.println();

//		使用for + while
		for (int j2 = 1; j2 <= 9; j2++) {
			int k2 = 1;
			while (k2 <= 9) {
				System.out.print(k2 + "*" + j2 + "=" + k2 * j2 + "\t");
				k2++;
			}
			System.out.println();
		}
		System.out.println();
//		
//		使用for + do while
		for (int j3 = 1; j3 <= 9; j3++) {
			int k3 = 1;
			do {
				System.out.print(k3 + "*" + j3 + "=" + k3 * j3 + "\t");
				k3++;
			} while (k3 <= 9);
			System.out.println();
		}
		System.out.println();

//		使用while + do while
		int j4 = 1;
		while (j4 <= 9) {
			int k4 = 1;
			do {
				System.out.print(k4 + "*" + j4 + "=" + k4 * j4 + "\t");
				k4++;
			} while (k4 <= 9);
			System.out.println();
			j4++;
		}
	}
}
