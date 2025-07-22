package hw7;

import java.io.FileOutputStream;

import java.io.IOException;
import java.io.PrintStream;
// 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//append功能讓每次執行結果都能被保存起來)
public class hw7_2 {
	public static void main(String[] args) throws IOException {
		int randomNum;
		FileOutputStream fos = new FileOutputStream("C:\\CJA102_Workspace\\Homework-05\\src\\hw7\\Data.txt", true);
		PrintStream ps = new PrintStream(fos);

		randomNum = getRandomNum();
		System.out.println(randomNum);

		ps.println(randomNum);
		fos.close();
	}

	public static int getRandomNum() {
		return (int) (Math.random() * 1000) + 1;
	}
}
