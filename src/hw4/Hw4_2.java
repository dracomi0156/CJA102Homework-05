package hw4;

public class Hw4_2 {
//	 • 請建立一個字串，經過程式執行後，輸入結果是反過來的
//	   例如String s = “Hello World”，執行結果即為dlroW olleH
//	   (提示：String方法，陣列)

	public static void main(String[] args) {
		String str1 = "Hello World";
		String str2 = "This is a test line.";
		printReverseString(str1);
		printReverseString(str2);
	}

	public static void printReverseString(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}

}
