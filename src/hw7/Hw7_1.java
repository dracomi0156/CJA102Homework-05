package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// 請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
// Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料
public class Hw7_1 {
	public static void main(String[] args) throws IOException {

		File inputFile = new File(".\\src\\hw7\\Sample2.txt");
		FileReader fr = new FileReader(inputFile);

		int c;
		int cCount = 0;

		while ((c = fr.read()) != -1) {
//			System.out.print(cCount);
//			System.out.print((char) c);
//			System.out.println();
			cCount++;
		}
		fr.close();

		File inputFile2 = new File(".\\src\\hw7\\Sample.txt");
		FileReader fr2 = new FileReader(inputFile2);
		BufferedReader br2 = new BufferedReader(fr2);
		String str;
		int strCount = 0;
		while ((str = br2.readLine()) != null) {
			strCount++;
//			System.out.println(str);
//			System.out.println(strCount);
		}

		br2.close();
		fr2.close();

		System.out.print(
				inputFile.getName() + "檔案共有" + inputFile.length() + "個位元組，" + (cCount - 1) + "個字元，" + strCount + "列資料");

	}
}
