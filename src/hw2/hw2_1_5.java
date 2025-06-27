package hw2;

public class hw2_1_5 {
	public static void main(String[] args) {
		
//		 • 請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int sum=0, i=1;
		while(i<=1000) {
			if(i%2 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("sum="+sum);
		System.out.println();
		
		
//		 • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int product=1;
		for(int j=1; j<=10; j++) {
			product = product*j;
		}
		System.out.println("product="+product);
		System.out.println();
		
		
//		 • 請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int product2=1;
		int k=1;
		while(k<=10) {
			product2 = product2*k;
			k++;
		}
		System.out.println("product2="+product2);
		System.out.println();
		
		
//		 • 請設計一隻Java程式，輸出結果為以下：
//		   1 4 9 16 25 36 49 64 81 100
		for(int m=1; m<=10; m++) {
			System.out.print(m*m+" ");
		}
		System.out.println("\n");
		
		
//		 • 阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		   輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int count = 0;
		for(int n=1; n<=49; n++) {
			if(!(n%10==4 || n/10==4)) {
				System.out.print(n+" ");
				count++;
			}
		}
		System.out.println();
		System.out.print("總共: "+count+"個");
		
	}
}
