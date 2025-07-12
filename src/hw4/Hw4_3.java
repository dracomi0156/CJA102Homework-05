package hw4;

public class Hw4_3 {
//	 • 有個字串陣列如下(八大行星)：
//	   {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//	   請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//	   (提示：字元比對，String方法)

	public static void main(String[] args) {
		String[] planetArray = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int vowelNum = countVowel(planetArray);
		System.out.println(vowelNum);
	}

	public static int countVowel(String[] strArray) {
		int count = 0;
		for (int i = 0; i < strArray.length; i++) {
			for (int j = 0; j < strArray[i].length(); j++) {
				switch (strArray[i].charAt(j)) {
				case 'a':
					count++;
					break;
				case 'e':
					count++;
					break;
				case 'i':
					count++;
					break;
				case 'o':
					count++;
					break;
				case 'u':
					count++;
					break;
				}
			}
		}
		return count;
	}

}
