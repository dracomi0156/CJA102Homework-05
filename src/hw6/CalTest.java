package hw6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {

		for (int i = 1; i < 4; i++) {
			int result;
			int x = 0;
			int y = 0;
			Scanner sc = new Scanner(System.in);

			try {
				System.out.println("請輸入x的值");
				x = sc.nextInt();
				System.out.println("請輸入y的值");
				y = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");
				continue;
			}

			try {
				Calculator c1 = new Calculator();
				result = c1.powerXY(x, y);
				System.out.println(x + "的" + y + "次方=" + result);

			} catch (CalException e) {
				System.out.println(e.getMessage());
			}
			System.out.println("===============");

		}

	}
}
