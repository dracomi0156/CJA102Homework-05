package classTest;

public class Test1 {
	public static void main(String[] args) {
		int a = 8;
		int sum = 6;
		sum = +a * 2;

		System.out.println(sum);
		
		
		int[][] arr = new int[3][2];
		int[][] arr2 = { {1,2,3,4,5},{6,7,8,9,10} };
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = 1;
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] class901 = new int[3][];
		class901[0]=new int[3];
		class901[1]= new int[2];
		

	}

}
