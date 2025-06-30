package classTest;

public class Test1 {
	public static void main(String[] args) {
		int a = 8;
		int sum = 6;
		sum = +a * 2;

		System.out.println(sum);
		
		
		int[][] arr1 = { {1,2,3},{4,5,6}};
		int[][] arr2 = new int[2][3];
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = arr1[i][j];
			}
		}
		arr1[0][1]=99;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
		}
		System.out.println();
		
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+" ");
			}
		}
		System.out.println();
	
	}

}
