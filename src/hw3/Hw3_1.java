package hw3;

import java.util.Scanner;

public class Hw3_1 {
	public static void main(String[] args) {
//		• 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形
		int[] t = { 0, 0, 0 };

		Scanner sc = new Scanner(System.in);

		System.out.println("請輸入三角形邊長:");
		for (int i = 0; i < 3; i++) {
			if (sc.hasNextInt()) {
				t[i] = sc.nextInt();
			}
		}
//		Arrays.sort(t);

		if ((t[0] <= 0 || t[1] <= 0 || t[2] <= 0) || (t[0] + t[1] <= t[2]) || (t[0] + t[2] <= t[1])
				|| (t[1] + t[2] <= t[0])) {
			System.out.println("不是三角形");
		} else if (t[0] == t[1] && t[1] == t[2]) {
			System.out.println("正三角形");
		} else if (t[0] == t[1] || t[1] == t[2] || t[0] == t[2]) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}

	}

}
