package hw4;

import java.util.Scanner;

public class Hw4_5 {
//	• 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//	  例：輸入1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」

	public static void main(String[] args) {
		System.out.print("請輸入日期(西元年yyyy 月mm 日dd): ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();

		System.out.print(countDay(year, month, day));
	}

	public static String countDay(int year, int month, int day) {
		// 過濾錯誤年份
		if (year <= 0) {
			return "Wrong Year";
		}
		// 過濾錯誤月份
		if (month <= 0 || month > 12) {
			return "Wrong Month";
		}

		int sumDays = 0;

		// 初始值為正常年的天數
		int[] yearDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		// 先判斷是不是閏年
		// 100的倍數&400的倍數=閏年 || 4的倍數=閏年
		// 1800, 1900非閏年
		if (((year % 100 == 0) && (year % 400 == 0)) || (year % 4 == 0)) {
			yearDays[1] = 29; // 閏年的2月改成29天
		}

		// 過濾錯誤日期: !(日期大於0 & 不超出當月份天數)
		if (day <= 0 || day > yearDays[month - 1]) {
			return "Wrong Date";
		}

		for (int i = 0; i < (month - 1); i++) {
			sumDays += yearDays[i];
		}
		sumDays += day;
		return "輸入的日期為該年第" + sumDays + "天";
	}

}
