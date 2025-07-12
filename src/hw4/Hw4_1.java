package hw4;

public class Hw4_1 {

	public static void main(String[] args) {
//		• 有個一維陣列如下：
//		  {29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		  請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		  (提示：陣列，length屬性)

		int[] arr1 = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int[] arr2 = { 59, 14, 3, 25, 78, 68, 68, 75, 101, 8 };
		getAvgAndElement(arr1);
		getAvgAndElement(arr2);
	}

	public static void getAvgAndElement(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		double avg = (double) sum / array.length;
		System.out.println("平均值:" + avg);
		System.out.println("大於平均值的元素:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > avg) {
				System.out.print("array[" + i + "]=" + array[i] + "\n");
			}
		}
		System.out.println();
	}

}
