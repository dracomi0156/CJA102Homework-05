package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//  承hw7_4，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
//  型簡化本題的程式設計)
public class hw7_5 {
	public static void main(String[] args) {

		Pet pets[] = new Pet[4];
		pets[0] = new Cat("貓貓1號");
		pets[1] = new Cat("貓貓2號");
		pets[2] = new Dog("狗勾1號");
		pets[3] = new Dog("狗勾2號");

		// 新建C:\data資料夾
		File dir = new File("C:\\data");
		if (!dir.exists()) {
			dir.mkdir();
		}

		// 把Cat, Dog物件 輸出到C:\data\Object.ser
		File outputFile = new File("C:\\data\\Object.ser");
		try {
			FileOutputStream fos = new FileOutputStream(outputFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			for (int i = 0; i < pets.length; i++) {
				oos.writeObject(pets[i]);
			}

			fos.close();
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		// 從C:\data\Object.ser輸入
		File inputFile = new File("C:\\data\\Object.ser");

		try {
			FileInputStream fis = new FileInputStream(inputFile);
			ObjectInputStream ois = new ObjectInputStream(fis);

			while (true) {
				((Pet) ois.readObject()).speak();
			}

		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
