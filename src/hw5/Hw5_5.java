package hw5;

public class Hw5_5 {
//	身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為:");
		System.out.println(genAuthCode());
		
//		System.out.println('a'+0);
//		System.out.println('z'+0);
//		System.out.println('0'+0);
//		System.out.println('9'+0);
	}

//	0~9(48~57) 10~35(A~Z = 65~90) 36~61(a~z = 97~122)
	public static String genAuthCode() {

//		char[] randomDigits = new char[8];
		String result = "";
		for (int i = 0; i < 8; i++) {
			int randomDigit = (int) (Math.random() * 62);

			if (randomDigit <= 9) {
				randomDigit += 48;
			} else if (randomDigit > 9 && randomDigit <= 35) {
				randomDigit += 55;

			} else if (randomDigit > 35) {
				randomDigit += 61;
			}

			result = result + (char) randomDigit;
		}
		return result;
		
	}

}
