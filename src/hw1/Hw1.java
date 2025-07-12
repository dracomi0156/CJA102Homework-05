package hw1;

import java.math.*;

public class Hw1 {
	public static void main(String[] args) {

//		• 請設計一隻Java程式，計算12，6這兩個數值的和與積
		int x = 6, y = 12;
		int sum = x + y;
		int product = x * y;
		System.out.println("1st answer:");
		System.out.println("Sum = " + sum);
		System.out.println("Product = " + product);
		System.out.println("");

//		• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？(一打為12顆)
		int eggs = 200;
		int dozen = 200 / 12;
		int left = 200 % 12;
		System.out.println("2nd answer:");
		System.out.print(dozen + "打");
		System.out.println(left + "顆");
		System.out.println("");

//		• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int totalSec = 256559;
		int leftSec = totalSec % 60;
		int min = totalSec / 60 % 60;
		int hour = totalSec / 60 / 60 % 24;
		int day = totalSec / 60 / 60 / 24;
		System.out.println("3rd answer:");
		System.out.println(day + "天 " + hour + "小時 " + min + "分 " + leftSec + "秒");
		System.out.println("");

//		• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
//		final double pi = 3.1415;
//		int radius = 5;
//		double area = radius*radius*pi;
//		double circumference = radius*2*pi;
//		System.out.println("4th answer:");
//		System.out.println("area = "+area);
//		System.out.println("circumference = "+circumference);
//		System.out.println("");

		BigDecimal pi = new BigDecimal("3.1415");
		BigDecimal radius = new BigDecimal("5");

		BigDecimal area = pi.multiply(radius).multiply(radius);
		BigDecimal circumference = pi.multiply(radius).multiply(BigDecimal.valueOf(2));

		System.out.println("4th answer:");
		System.out.println("area = " + area);
		System.out.println("circumference = " + circumference);
		System.out.println("");

//		• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		  金加利息共有多少錢 (用複利計算，公式請自行google)
		int pv = 1500000;
		double rate = 0.02;
		double fv = pv * Math.pow((1 + rate), 10);
		System.out.println("5th answer:");
		System.out.println("10年後本金+利息共: $" + fv);
		System.out.println("");

//		• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		  5 + 5
//		  5 + ‘5’
//		  5 + “5”
//		  並請用註解各別說明答案的產生原因
		System.out.println("6th answer:");
		System.out.println(5 + 5); // int + int => 運算結果還是int

//		System.out.println((int)'5');  字元轉換成unicode數字=53
		System.out.println(5 + '5'); // int + char => 字元轉換成unicode數字=53 => int + int

		System.out.println(5 + "5"); // int + String => 轉換成字串相加 => String + String

	}

}
