package hw2;

public class hw2_6_7 {
	public static void main(String[] args) {
//		• 請設計一隻Java程式，輸出結果為以下：
//		  1 2 3 4 5 6 7 8 9 10
//		  1 2 3 4 5 6 7 8 9
//		  1 2 3 4 5 6 7 8
//		  1 2 3 4 5 6 7
//		  1 2 3 4 5 6 
//		  1 2 3 4 5
//		  1 2 3 4 
//		  1 2 3 
//		  1 2 
//		  1
		
		for(int i=0; i<10; i++) {
			for(int j=1; j<=10-i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		
//		• 請設計一隻Java程式，輸出結果為以下：
//		 A
//		 BB
//		 CCC
//		 DDDD
//		 EEEEE
//		 FFFFFF
		char x = 'A';
		for(int m=1; m<=6; m++) {
			for(int n=1; n<=m; n++) {
				System.out.print((char)x);
			}
			System.out.println();
			x++;
		}
		
		
//		for(int m=1; m<=6; m++) {
//			for(int n=x; n<x+m; n++) {
//				System.out.print((char)n);
//			}
//			System.out.println();
//		}
//		
		
		
	}
}
