package hw7;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
// 代表的檔案會複製到第二個參數代表的檔案
public class hw7_3 {
	public static void main(String args[]) {

		File f1 = new File(".\\src\\hw7\\test.txt");
		File f2 = new File(".\\src\\hw7\\test-copy.txt");

		copyFile(f1, f2);

	}

	public static void copyFile(File f1, File f2) {

		try {
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);

			int c;
			while ((c = fr.read()) != -1) {
				fw.write(c);
//				System.out.print((char) c);
			}

			fw.close();
			fr.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
