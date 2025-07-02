package hw3;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class hw3_3 {
	public static void main(String[] args) {
		
//		• 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		的號碼與總數
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文...請輸入你討厭哪個數字？(1~9)");
		int chooseNumber = sc.nextInt();
		int count = 0, count6 = 0;
		int[] number = new int[49];
		int[] choose6 = new int[6];
		int randomNumber = (int)(Math.random()*50);
		
		// 篩選掉不要的號碼
		for(int i=1; i<=49; i++) {
			if(i/10 != chooseNumber  && i%10 != chooseNumber) {
				number[i-1] = i;
				count++;
			}else {
				number[i-1] = 0;
			}
		}
		
		// 印出篩選完剩下的號碼
		for(int i=0; i<49; i++) {
			if(number[i] != 0) {
				System.out.print(number[i] + " ");
			}
		}
		System.out.println();
		System.out.println("總共有" + count + "數字可選");
		
		// 選6個號碼
		while(count6 < 6) {
			randomNumber = (int)(Math.random()*49+1);
			for(int i=0; i<49; i++) {
				if(number[i] == randomNumber && number[i] != 0) {
					choose6[count6] = randomNumber;
					number[i] = 0;
					count6++;
				}
			}
		}
		
		// 印出剛剛選好的6個號碼
		System.out.print("亂數選6個號碼: ");
		for(int i=0; i<6; i++) {
			System.out.print(choose6[i] + " ");
		}
		

	}

}
