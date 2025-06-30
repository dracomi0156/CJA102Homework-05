package hw3;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class hw3_2 {
	public static void main(String[] args) {
		
//		• 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息
		
//		int randomNumber = (int)(Math.random() * 10);
		int randomNumber = (int)(Math.random() * 101);
		
//		System.out.println("請輸入0~9的整數:");
		System.out.println("請輸入0~100的整數:");
	
		Scanner sc = new Scanner(System.in);
		int myGuess = sc.nextInt();
		
		while(myGuess != randomNumber) {
			System.out.println("猜錯囉!");
			if(myGuess > randomNumber) {
				System.out.println("數字太大啦!");
			}else {
				System.out.println("數字太小啦!");
			}
			myGuess = sc.nextInt();
		}
		System.out.println("Bingo! 答案就是" + randomNumber);
		
	}

}
