package classTest;

public class setArrayRandom3x3 {
	
	public void setArrayRandom(int[][] arr) {
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr.length; j++) {
			arr[i][j] = (int)(Math.random()*31);
			System.out.print(arr[i][j]+" ");
		}
		System.out.println();
	}
}

}
