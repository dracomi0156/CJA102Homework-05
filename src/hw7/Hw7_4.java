package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// 請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
// 意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
public class Hw7_4 {
	public static void main(String[] args) {

		Cat c1 = new Cat("貓貓1號");
		Cat c2 = new Cat("貓貓2號");
		Dog d1 = new Dog("狗勾1號");
		Dog d2 = new Dog("狗勾2號");

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

			oos.writeObject(c1);
			oos.writeObject(c2);
			oos.writeObject(d1);
			oos.writeObject(d2);

			fos.close();
			oos.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
