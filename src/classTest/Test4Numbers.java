package classTest;

public class Test4Numbers {
	public static void main(String[] args) {
//		輸出0~100裡4的倍數
		for(int i=0; i<=100; i++) {
			if(i%4 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();      //換1行
//		System.out.print("\n");    //換1行
//		System.out.println("\n");  //換2行  
		
		
//		印星星-直角三角
		for(int j=1; j<=5; j++) {
			for(int k=1; k<=j; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
//		印星星-正三角
		int n = 10;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=(n-i); j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			System.out.println();			
		}
		
		n=9; 
		for(int m=n; m>=1; m--) {
			for(int p=1; p<=(n-m+1); p++) {
				System.out.print(" ");
			}
			for(int q=1; q<=(2*m-1); q++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
}
